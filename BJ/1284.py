import sys

input = sys.stdin.readline

while True:
    T = input().strip()
    if(T == "0"):
        break
    else:
        result = 2
        cnt = 0
        for v in T:
            if v == "1":
                result +=2
            elif v == "0":
                result +=4
            else:
                result +=3
            cnt +=1
        if cnt == 1:
            print(result)
        else:
            result += (cnt-1)
            print(result)