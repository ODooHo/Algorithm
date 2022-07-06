import sys

input = sys.stdin.readline


i = 1
while True:
    L,P,V = map(int,input().split())
    if L == 0 and P == 0 and V == 0:
        exit()
    else:
        a = V//P
        b = min((V%P),L)
        count=a*L
        count+=b
        print(f"Case {i}: {count}")
        i+=1


