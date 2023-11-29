import sys

input = sys.stdin.readline


N,M = map(int,input().split())

graph = [list(map(int,input().split())) for _ in range(N)]

print(graph)

dx = [-1,0,1]
dy = [-1,-1,-1]

