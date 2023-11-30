import sys


input = sys.stdin.readline


T = int(input())


for _ in range(T):
    n,k,t,m = map(int,input().split())
    problem = [[] for _ in range(m+1)]
    score = [[] for _ in range(m+1)]
    for k in range(m):
        i,j,s = map(int,input().split())
        problem[j].append((i,s,k+1))

        
