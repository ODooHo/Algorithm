import sys

input = sys.stdin.readline



T = int(input())

for _ in range(T):
    sub = []
    app = 1
    N  = int(input())
    for i in range(N):
        sub.append(tuple(map(int,input().split())))
    sub.sort(key = lambda x:x[0])
    first = sub[0][1] #서류 등수로 정렬
    for i in range(1,len(sub)):
        if first>sub[i][1]:
            app+=1
            first = sub[i][1]
    print(app)

