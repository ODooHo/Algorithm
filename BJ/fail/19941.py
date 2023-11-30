import sys

input = sys.stdin.readline


N,K = map(int,input().split())

line = list(input())
cnt = 0
for i in range(len(line)):
    if line[i] =='P':
        left = max(i-K,0)
        right = min((i+K+1),N)
        for j in range(left,right):
            if line[j] == 'H':
                line[j] = 'X'
                cnt+=1
                break
        



print(cnt) 

        

