import sys

input = sys.stdin.readline

square = [0,1,2]

n = int(input())
for i in range(3,n+1):
    square.append(square[i-2]+square[i-1])
print(square[n]%10007)
