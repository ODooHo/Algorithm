import sys

input = sys.stdin.readline


while True:
    triangle = list(map(int,input().split()))
    if(triangle[0] == 0 and triangle[1] == 0 and triangle[2] == 0):
        break
    temp = max(triangle)
    if (sum(triangle) - temp <= temp):
        print("Invalid")
    else:
        if triangle[0] == triangle[1] == triangle[2]:
            print("Equilateral")
        elif triangle[0] == triangle[1] or triangle[0] == triangle[2] or triangle[2] == triangle[1]:
            print("Isosceles")
        else:
            print("Scalene")
