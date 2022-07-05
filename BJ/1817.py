N,M = map(int,input().split())
box = 1
book = 0
if N==0:
    print(0)
else:
    weight = list(map(int,input().split()))
    for i in range(N-1,-1,-1):
        book += weight[i]
        if book>M:
            box+=1
            book = weight[i]
    print(box)