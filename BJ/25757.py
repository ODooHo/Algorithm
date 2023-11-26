import sys

input = sys.stdin.readline


N , kind = map(str,input().split())

N = int(N)


name = set()

for i in range(N):
    name.add(input().rstrip())


if(kind == 'Y'):
    print(len(name))
elif(kind == 'F'):
    print(len(name)//2)
elif(kind == 'O'):
    print(len(name)//3)

# if(kind == 'Y'):
#     cnt = 1
# elif(kind == 'F'):
#     cnt = 2
# elif(kind == 'O'):
#     cnt = 3

# temp = set()
# blackList = set()
# result = 0
# for i in range(N):
#     id = input().rstrip()
#     if id not in temp and id not in blackList:
#         temp.add(id)
#         blackList.add(id)
#     else:
#         continue

#     if len(temp) == cnt:
#         result +=1
#         temp = set()


# print(result)
