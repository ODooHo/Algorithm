A = 300
B = 60
C = 10


T = int(input())

cnta = 0
cntb = 0
cntc = 0


while T>=C:
    if T - A >=0:
        T = T - A
        cnta+=1
        continue
    elif T - B >=0:
        T = T - B
        cntb +=1
        continue
    elif T - C >=0:
        T = T - C
        cntc+=1
        continue
if 0<T<C:
    print(-1)
else:
    print(cnta,cntb,cntc)
