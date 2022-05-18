import sys

input = sys.stdin.readline

n,k = map(int,input().split())
coin = [0 for _ in range(n)]
dp = [0 for _ in range(k+1)]
dp[0] = 1 #동전 하나만 쓸 때
for i in range(n):
    coin[i] = int(input())

for i in coin:
    for j in range(i,k+1):
        if j-i >= 0:
            dp[j] += dp[j-i]
            print(dp.index(dp[j]),dp[j])
print(dp)
print(dp[k])
