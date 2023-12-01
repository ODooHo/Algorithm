import sys

input = sys.stdin.readline


temp = input().strip()

croatia = ['dz=','c=','c-','d-','lj','nj','s=','z=']

cnt = 0


for check in croatia:
    if check in temp:  
        if(check == 'dz='):
            temp = temp.replace('dz=','a')
            cnt+=2
        else:
            temp = temp.replace(check,'a')
            cnt+=1
print(len(temp))