import sys

input = sys.stdin.readline


N = int(input())
tip = []
money = 0

for i in range(N):
    tip.append(int(input()))

tip = sorted(tip,reverse=True)

for i in range(N):
    if(tip[i]-(i)<0):
        continue
    else:
        money += (tip[i]-(i))
print(money)
