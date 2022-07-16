import sys
sys.setrecursionlimit(10**9)
input = sys.stdin.readline

def fs(N,M,graph):
    count = 0

    for i in range(N):
        a = ""
        for j in range(M):
            if graph[i][j] == '-':
                if graph[i][j] != a:
                    count+=1
            a = graph[i][j]

    for j in range(M):
        a = ""
        for i in range(N):
            if graph[i][j] == "|":
                if graph[i][j] != a:
                    count+=1
            a = graph[i][j]
    print(count)

N,M = map(int,input().split())

graph = []
for i in range(N):
    graph.append(input().rstrip())

fs(N,M,graph)


