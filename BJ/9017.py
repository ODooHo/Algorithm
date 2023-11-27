import sys


input = sys.stdin.readline

T = int(input())



for _ in range(T):
    N = int(input())
    race = list(map(int,input().split()))
    temp = set(race)
    check = [[] for _ in range(len(temp))]
    
    
    blacklist = []
    for i in temp:
        counter = 0
        for j in range(len(race)):
            if(race[j] == i):
                counter+=1
        if counter<6:
                blacklist.append(i)
 
    
    for i in range(len(blacklist)):
        temp.discard(blacklist[i])
        check[blacklist[i]-1] = [10000000000000,10000000000000,10000000000000,10000000000000,10000000000000,10000000000000]
        continue


    for i in temp:
        rank = 1
        for j in range(len(race)):
            if(race[j] == i):
                check[i-1].append(rank)
                rank+=1
            elif(race[j] in temp):
                rank+=1

    for i in range(len(check)):
        check[i] = (sum(check[i][:4]),check[i][4],i+1)
    
    check.sort(key=lambda x : (x[0],x[1]))

    print(check[0][2])
    
    

    
