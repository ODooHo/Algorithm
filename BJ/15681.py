import sys
sys.setrecursionlimit(10**9)

input = sys.stdin.readline

def dfs(root):
    subtree[root] = 1
    visited[root] = True
    for i in tree[root]:
        if not visited[i]:
            dfs(i)
            subtree[root] += subtree[i]

N,R,Q = map(int,input().split())

tree = [[]*(N+1) for _ in range(N+1)]
subtree = [0]*(N+1)
visited = [False] * (N+1)

for i in range(N-1):
    a,b = map(int,input().split())
    tree[a].append(b)
    tree[b].append(a)

dfs(R)

for _ in range(Q):
    a = int(input())
    print(subtree[a])

