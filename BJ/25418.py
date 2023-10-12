import sys

input = sys.stdin.readline

a, k = map(int, input().split())
cnt = 0
while(1):
    if a == k:
        print(cnt)
        break

    if k % 2 == 0 and k >= a*2:
        k /=2
        cnt+=1
    else:
        k -=1
        cnt+=1

