import sys
from collections import deque

input = sys.stdin.readline



N = int(input())

card = deque([i for i in range(1,N+1)])

flag = True
while(len(card) !=1):
    if flag:
        card.popleft()
        flag = False
    else:
        temp = card.popleft()
        card.append(temp)
        flag = True

print(card[0])