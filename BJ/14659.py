N = int(input())

archer=list(map(int,input().split()))

count = [0 for _ in range(N)]
a = 0
for i in range(len(archer)):
    if archer[a]>archer[i]:
        count[a]+=1
    if archer[a]<archer[i]:
        a = i
print(max(count))
