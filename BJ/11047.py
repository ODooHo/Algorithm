import sys


N,K = map(int,sys.stdin.readline().split())
coin = [0 for _ in range(N)]
cnt = 0
for i in range(N):
    coin[i]=int(sys.stdin.readline())

coin = list(reversed(coin))

for j in range(N):
    cnt += K//coin[j] #나눈 몫을 저장
    K = K%coin[j] #나머지로 계산
    print(K)


print(cnt)



