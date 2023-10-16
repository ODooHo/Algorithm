import sys
from collections import deque


input = sys.stdin.readline

def bfs(s,t,count):
    queue = deque()
    queue.append((s,t,count))
    visited = [-1] * 300
    
    while queue:
        s,t,count = queue.popleft()
        if s<=t and visited[s] == -1:
            queue.append((s*2,t+3,count+1))
            queue.append((s+1,t,count+1))
        if s == t:
            return count


    


C = int(input())

for i in range(C):
    s,t = map(int,input().split())
    result = bfs(s,t,0)
    print(result)