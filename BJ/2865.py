import sys

input = sys.stdin.readline


N,M,K = map(int,input().split())

ability = {}

for i in range(N):
    ability[i+1] = 0

for i in range(M):
    temp = list(map(float,input().split()))
    for j in range(0, 2*N, 2): #2N번, 2개씩 올리면서 (참가자 번호, 능력) 으로 입력이 주어지기 때문
        if temp[j+1] > ability[temp[j]]: #능력이 가장 좋은 것 만
            ability[temp[j]] = temp[j+1]

score = sorted(list(ability.values()),reverse = True)
sum = sum(score[:K])

print('%.1f'%sum)