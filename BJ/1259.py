import sys


while True:
    plus=0
    minus=0
    answer="no"
    N = sys.stdin.readline()
    if(N=='0\n'):
        break
    j=len(N)-1
    for i in range(len(N)):
        if N[i]==N[j-1]:
            j=j-1
        else:
            print(answer)
            break
    if i==len(N)-1:
        answer="yes"
        print(answer)


