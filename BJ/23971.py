import sys
import math

input = sys.stdin.readline

H,W,N,M = map(int,input().split())


x = math.ceil(H/(N+1))
y = math.ceil(W/(M+1))

print(x*y)