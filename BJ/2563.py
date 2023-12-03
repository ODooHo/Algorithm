import sys

input = sys.stdin.readline

N = int(input())


field = [[0 for _ in range(101)] for _ in range(101)]

for i in range(N):
    x,y = list(map(int,input().split()))

    for row in range(x,x+10):
        for col in range(y,y+10):
            field[row][col] = 1



result = 0 

for i in field:
    result += sum(i)


print(result)