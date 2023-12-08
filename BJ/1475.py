import sys

input = sys.stdin.readline



num = ['1','2','3','4','5','6','7','8','9']

N = list(input().strip())

check = [0 for i in range(10)]

cnt = 0

flag = True

for temp in N:
    if temp == '6' or temp == '9':
        if flag:
            check[6] +=1
            flag = False       
        else:
            check[9] +=1
            flag = True
    else:
        check[int(temp)] +=1

print(max(check))