import sys

input = sys.stdin.readline


switch = []

def change(switch, i):
    if switch[i] == 0:
        switch[i] = 1
    else:
        switch[i] = 0


T = int(input())
switch = list(map(int,input().split()))
switch = [-1] + switch
student = int(input().strip())

for i in range(student):
    gender, num = map(int,input().split())
    if gender == 1:
        for j in range(1,len(switch)):
            if j % (num) == 0:
                change(switch,j) 
    else:
        change(switch,num)
        for j in range(1,len(switch)):
            if (num+j)>=len(switch) or (num-j)<=0:
                break
            if switch[num-j] == switch[num+j]:
                change(switch,num-j)
                change(switch,num+j)
            else:
                break


switch = switch[1:]

counter = 0
for i in range(len(switch)):
    if (counter == 20):
        counter = 0
        print("")
    print(switch[i],end = " ")
    counter +=1