import sys
from operator import itemgetter


input = sys.stdin.readline


N,K = map(int,input().split())


country = []


for i in range(N):
    temp = list(map(int,input().split()))
    country.append(temp)

country.sort(key =lambda x : (x[1],x[2],x[3]),reverse= True)


for i in range(N):
    if country[i][0] == K:
        index = i
        break

for i in range(N):
    if country[i][1:] == country[index][1:]:
        print(i+1)
        break
