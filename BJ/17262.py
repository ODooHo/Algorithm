import sys

input = sys.stdin.readline

count = 0
fan = []
N = int(input())

group = 0

for i in range(N):
    a = tuple(map(int,input().split()))
    fan.append(a)
go = sorted(fan,key = lambda x:x[0])
back = sorted(fan, key = lambda x:x[1])

result = go[-1][0] - back[0][1]

if result <= 0:
    print(0)
else:
    print(result)