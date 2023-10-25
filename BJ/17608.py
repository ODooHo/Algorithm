import sys

input = sys.stdin.readline



N = int(input())

graph = [0 for _ in range(N+1)]


for i in range(N):
    temp = int(input())
    graph[i] = temp

graph = graph[::-1]

cnt = 0
height = graph[0]

for i in range(1,len(graph)):
    if height >= graph[i]:
        continue
    else:
        height = graph[i]
        cnt+=1

print(cnt)