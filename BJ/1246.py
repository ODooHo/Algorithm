import sys

input = sys.stdin.readline


N,M = map(int,input().split())
temp = 0

price = []
result =0
for i in range(M):
    price.append(int(input()))
price = sorted(price,reverse = True)

for i in range(M):
    if i + 1 > N:
        profit = price[i]*N
    else:
        profit = price[i]*(i+1)

    if result < profit:
        p = price[i]
        result = profit
print(p,result)
