import sys

input = sys.stdin.readline

n = int(input())

student = list(map(int,input().split()))

team = [0 for _ in range(n)]

student.sort()


for i in range(n):
    team[i] = student[i] + student[-(i+1)]

print(min(team))





