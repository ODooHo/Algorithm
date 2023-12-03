import sys

input = sys.stdin.readline

K = int(input())

num = []
cnt = 1
for i in range(K):
    temp = int(input())
    if temp == 0:
        num = num[:-1]
    else:
        num.append(temp)

print(sum(num))