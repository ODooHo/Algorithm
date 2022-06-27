import sys

input = sys.stdin.readline

price = 0
N, M = map(int, input().split())
minp = 100000
mins = 100000
sp = [0 for _ in range(M)]
s = [0 for _ in range(M)]
for i in range(M):
    sp[i], s[i] = map(int, input().split())

minp = min(sp)
mins = min(s)
if minp>mins*6:
    price += N * mins
else:
    price +=(N//6)*minp
    if (N%6)*mins > minp:
        price += minp
    else:
        price += (N%6)*mins


print(price)
