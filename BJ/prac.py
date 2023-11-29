import sys

input = sys.stdin.readline

V,E = map(int,input().split())

graph = [[] for _ in range(V+1)]


for i in range(E):
    a,b = map(int,input().split())
    graph[a].append(b)

print(graph)
