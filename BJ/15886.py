import sys

input = sys.stdin.readline


n = int(input())

graph = input()
visited = [False] * len(graph)
cnt = 0

for i in range(len(graph)):
    if graph[i] == "E":
        continue
    if graph[i] == "W":
        if graph[i-1] == "W":
            continue
        else:
            cnt+=1
print(cnt)


