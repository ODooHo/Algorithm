import sys


input = sys.stdin.readline

N = int(input())


score = []
for i in range(N):
    a = int(input())
    score.append(a)

score.sort()

hate = 0

for i in range(N):
    hate += abs(score[i] - (i+1))


print(hate)