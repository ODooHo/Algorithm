import sys

input = sys.stdin.readline


N = int(input())

temp = []


for i in range(N):
    (x,y) = map(int,input().split())
    temp.append((x,y))




for i in range(N):
    grade = 1
    for j in range(N):
        if(temp[i][0] < temp[j][0] and temp[i][1] < temp[j][1]):
            grade +=1
    print(grade,end=" ")
