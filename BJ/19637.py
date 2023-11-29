import sys

input = sys.stdin.readline



N,M = map(int,input().split())

title = []

for i in range(N):
    a,b = input().split()
    title.append((a,int(b)))


def bs(title,cnt):
    start,end = 0, len(title) -1
    result = 0

    while start <= end:
        mid = (start + end) // 2
        if int(title[mid][1] >= cnt):
            end = mid -1
            result = mid
        else:
            start = mid +1
        
    return result




for i in range(M):
    a = int(input()) 
    print(title[bs(title,a)][0])



