import sys

input = sys.stdin.readline


N = int(input())
room = []
count = 1
for i in range(N):
    room.append(tuple(map(int,input().split())))
room = sorted(room, key = lambda x:x[0])
room = sorted(room, key = lambda x:x[1])

enter = room[0][1]

for i in range(1,N):
    if enter<=room[i][0]:
        enter = room[i][1]
        count+=1
print(count)
