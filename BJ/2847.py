import sys

input = sys.stdin.readline


N = int(input())
count = 0
level = []

for i in range(N):
    level.append(int(input()))



for i in range(len(level)-1,0,-1):
    if level[i-1]>=level[i]:
        count += (level[i-1] - level[i]+1)
        level[i-1] -= (level[i-1] - level[i]+1)
print(count)

