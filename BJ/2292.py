import sys

input = sys.stdin.readline


N =int(input())
cnt = 1

temp = 1

while N > temp:
    temp += 6 * cnt
    cnt += 1

print(cnt)