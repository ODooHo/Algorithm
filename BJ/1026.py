import sys

N = int(input())

A = list()
B = list()
index = [0 for _ in range(N)]
result = 0
A =list(map(int,sys.stdin.readline().split()))
B =list(map(int,sys.stdin.readline().split()))

for i in range(N):
    result += min(A) * max(B)
    A.pop(A.index(min(A)))
    B.pop(B.index(max(B)))
print(result)