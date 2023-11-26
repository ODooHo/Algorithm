import sys

input = sys.stdin.readline

N = int(input())


graph = [input() for _ in range(N)]

flag = False 

cookie = []

for i in range(N):
    for j in range(N):
        if graph[i][j] == "*":  #머리 찾으면
            cookie.append((i+1,j+1))

head = cookie[0]
heart = (head[0]+1,head[1])

print(heart[0],heart[1])

arm_L,arm_R  = 0

cnt_C = 0

leg_L,leg_R = 0

for part in cookie[1:]:
    if part[0] == heart[0] and part[1] < heart[1]:
        arm_L +=1
    elif part[0] == heart[0] and part[1] > heart[1]:
        arm_R +=1
    elif part[1] == heart[1] and part[0] > heart[0]:
        cnt_C +=1
    elif part[0] > heart[0] and part[1] < heart[1]:
        leg_L +=1
    elif part[0] > heart[0] and part[1] > heart[1]:
        leg_R +=1



print(arm_L,arm_R,cnt_C,leg_L,leg_R)