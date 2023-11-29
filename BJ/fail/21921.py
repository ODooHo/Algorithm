import sys

input = sys.stdin.readline

N,X = map(int,input().split())

visiter = list(map(int,input().split()))

maximum = 0



if max(visiter) == 0:
    print("SAD")
else:
    maximum = sum(visiter[0:X])
    value = maximum
    cnt = 1
    for i in range(X, N):
        value -= visiter[i-X]
        value += visiter[i]
        if value > maximum:
            maximum = value
            cnt = 1
        elif value == maximum:
            cnt += 1
    print(maximum)
    print(cnt)

#슬라이딩 윈도우 활용 x로 인한 시간초과

# for i in range(len(visiter)):
#     temp = visiter[i]
#     if (i+X) > N:
#         break
#     for j in range(1,X):
#         temp += visiter[i+j]
    
#     if temp > maximum:
#         maximum = temp
#         cnt = 1
#     elif temp == maximum:
#         cnt+=1

# if maximum == 0:
#     print("SAD") 
# else:
#     print(maximum)
#     print(cnt)

    
