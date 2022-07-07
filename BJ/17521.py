import sys

input = sys.stdin.readline


n,W = map(int,input().split())
coin = []
byte = 0

for i in range(n):
    coin.append(int(input()))

for i in range(n-1):
    if coin[i]<coin[i+1]:
        if W//coin[i]>0:
            byte = W//coin[i]
            W = W-(byte*coin[i])
    elif coin[i]>coin[i-1]:
        W += byte*coin[i]
        byte = 0
if byte>0:
    W += byte*coin[-1]
print(W)