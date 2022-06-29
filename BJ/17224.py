N,L,K = map(int,input().split())
SOLVED = 100
sub1 = [(0,0) for _ in range(N)]
result = 0
cnt = 0

for i in range(N):
    a,b = tuple(map(int,input().split()))
    sub1[i]= a,b
sub1.sort(key = lambda x:x[1],reverse=True)

for i in range(N):
    if cnt == K:
        break
    if sub1[i][1] <=L:
        result+=140
        cnt+=1
        sub1[i]+=(SOLVED,)
for i in range(N):
    if cnt==K:
        break
    if sub1[i][0]<=L:
        if len(sub1[i])!=2:
            continue
        result+=100
        cnt+=1

print(result)

