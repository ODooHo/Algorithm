import sys

input = sys.stdin.readline

P = int(input())


def test(temp):
    cnt = 0

    for i in range(1, len(temp)-1):
        for j in range(i+1,len(temp)):
            if temp[i] > temp[j]:
                temp[i],temp[j] = temp[j],temp[i]
                cnt +=1
    
    print(temp[0],cnt)




        
for _ in range(P):
    temp = list(map(int,input().split()))
    test(temp)
