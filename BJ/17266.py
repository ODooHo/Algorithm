import sys

input = sys.stdin.readline

N = int(input())
M = int(input())

light = list(map(int,input().split()))

if (M == 1):
    print(N)
else:
    if light[0]-1 