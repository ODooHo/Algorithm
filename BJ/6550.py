import sys

input = sys.stdin.readline


while True:
    try:
        a,b = map(str,input().split())
        if not a or not b:
            break
        flag = False
        counter = 0
        for i in range(len(b)):
            if a[counter] == b[i]:
                counter += 1
                if counter == len(a):
                    flag = True
                    break
        if flag:
            print("Yes")
        else:
            print("No")
    except:
        break