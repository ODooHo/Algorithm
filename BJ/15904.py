import sys


input = sys.stdin.readline


UCPC = input()
index_U=1000
index_C=1000
index_P=1000
index_0 = 0
cnt = 0


for i in range(len(UCPC)):
    if UCPC[i]=="U" and index_0 == 0:
        index_0=1000
        index_U = i
        cnt+=1
    elif UCPC[i]=="C" and i>index_U:
        index_C = i
        index_U = 1000
        cnt+=1
    elif UCPC[i]=="P" and i>index_C:
        index_P = i
        index_C=1000
        cnt+=1
    elif UCPC[i]=="C" and i>index_P:
        cnt+=1

if cnt>=4:
    print("I love UCPC")
else:
    print("I hate UCPC")