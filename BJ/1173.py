N,m,M,T,R = map(int,input().split())
n = 0
x = m
t = 0
while n<N:
    if x+T<=M:
        x=x+T
        n=n+1
        t=t+1
    else:
        if x-R<m:
            if t==0:
                t=-1
                break
            x=m
            t=t+1
        else:
            x=x-R
            t=t+1


print(t)