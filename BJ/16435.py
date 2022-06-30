import sys


input = sys.stdin.readline




N,L = map(int,input().split())

fruit = list(map(int,input().split()))

fruit = sorted(fruit)


for i in range(len(fruit)):
    if fruit[i]<=L:
        L+=1
print(L)