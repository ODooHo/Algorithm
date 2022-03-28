import sys

#현재 상황에서 지금 당장 좋은 것만 고르는 것.
#문제를 풀기 위한 최소한의 아이디어를 떠올릴 수 있냐?
#그 아이디어를 가지고, 최적의 해를 구할 수 있나, 정당성을 따지는 것이 가장 중요

N,K = map(int,sys.stdin.readline().split())
cnt = 0
while 1:
    if N == 1:
        break
    if N%K == 0:
        N=N/K
        cnt+=1
    else:
        N=N-1
        cnt+=1

print(cnt)