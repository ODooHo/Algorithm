import sys

N = int(input())
temp = []
tar = []
for i in range(N):
    a = sys.stdin.readline().strip()
    temp.append(a)
temp = set(temp)
temp = list(temp)

temp.sort()
temp.sort(key = len)
for j in temp:
    print(j)