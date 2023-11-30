import sys

input = sys.stdin.readline


N = int(input())
graph = [list(map(int,input().split())) for _ in range(N)]

graph =sorted(graph)

print(graph)