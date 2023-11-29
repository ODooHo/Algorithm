import sys

input = sys.stdin.readline


N = int(input())

region = list(map(int,input().split()))

limit = int(input())

start,end = 0,max(region)


#이분 탐색 해야함. 이분 탐색 , 시작과 끝을 정하고, 중간값과 비교하며 중간값을 줄여나가서 최종적으로 목표에 도달하는 방식

if sum(region) < limit:
    print(max(region))
else:

    while start <= end:
        mid = (start+ end) // 2
        min_budget = 0
        for i in region:
            if i > mid:
                min_budget += mid
            else:
                min_budget += i
        if min_budget<= limit:
            start = mid + 1
        else:
            end = mid - 1
    
    print(end)