import sys

N = int(input())
time = 0 #누적 시간
pre = 0#이전 시간
per = list(map(int,sys.stdin.readline().split()))

per.sort()
for i in range(N):
    pre=sum(per[:i])
    time += pre + per[i]

print(time)
