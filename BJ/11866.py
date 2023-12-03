import sys
from collections import deque

input = sys.stdin.readline


n,k = map(int,input().split())

graph = [i for i in range(1,n+1)]

graph = deque(graph)
pointer = 0


sequence = []

while len(graph)!= 0:
    for i in range(k-1):
        graph.append(graph.popleft())

    sequence.append(graph.popleft())

print('<',end="") 
for i in range(len(sequence)):
    if i == len(sequence)-1 :
        print(sequence[i],end="")
    else:
         print(sequence[i],end=', ')

print('>')