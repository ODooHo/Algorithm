import sys

input = sys.stdin.readline


N = int(input())
milk = list(map(int,input().split()))
s=0
cnt=0

for i in range(len(milk)):
    if milk[i]==0 and s == 0:
        s=1
        cnt+=1
    if milk[i]==1 and s == 1:
        s=2
        cnt+=1
    if milk[i]==2 and s == 2:
        s=0
        cnt+=1
print(cnt)
