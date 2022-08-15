from collections import deque
import sys

input = sys.stdin.readline




n = int(input())

def search():
    for k in range(n):
        for i in range(n):
            for j in range(n):
                if i == j:
                    continue
                if graph[i][j] == "Y" or (graph[i][k]=="Y" and graph[k][j]== "Y"):
                    visited[i][j] = 1
graph = [input().rstrip() for _ in range(n)]
visited = [[0]*n for _ in range(n)]
result = 0
search()

for i in range(n):
    cnt = 0
    for j in range(n):
        if visited[i][j]== 1:
            cnt+=1

    result = max(result,cnt)

print(result)

