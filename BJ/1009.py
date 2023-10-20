import sys

input = sys.stdin.readline

T = int(input())



for _ in range(T):
    a,b = map(int,input().split())
    a = a**b
    print(a%10)