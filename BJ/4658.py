import sys

input = sys.stdin.readline

gather = ['a','e','i','o','u']


def find_3(a,b,c):
    counter = 0
    if (a in gather):
        counter+=1
    if(b in gather):
        counter+=1
    if(c in gather):
        counter+=1
    return counter


def find_gather(temp):
    for i in gather:
        for j in temp:
            if i == j:
                return True
    
    return False



while True:
    flag_A = True
    flag_B = True
    flag_C = False
    temp = input().rstrip()
    if temp == "end":
        break


    for i in range(1,len(temp)):
        if(temp[i-1] == temp[i]):
            if temp[i] == 'e' or temp[i] == 'o':
                pass
            else:
                flag_A = False
                break

    
    for i in range(len(temp)-2):
        cnt = find_3(temp[i],temp[i+1],temp[i+2])
        if(cnt == 0 or cnt == 3):
            flag_B = False
            break
    
    if(find_gather(temp)):
        flag_C = True
    
    if(flag_C == flag_A == flag_B):
        print(f"<{temp}> is acceptable.")
    else:
        print(f"<{temp}> is not acceptable.")





