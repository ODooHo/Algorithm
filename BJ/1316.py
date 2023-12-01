import sys

input = sys.stdin.readline



N = int(input())


check = []

cnt = 0
for i in range(N):
    check = []
    flag = True
    temp = list(input().strip())
    pointer = temp[0]
    for j in range(len(temp)):
        if temp[j] not in check:
            check.append(temp[j])
            pointer = temp[j]
        elif temp[j] in check:
            if pointer != temp[j]:
                flag = False
                break
    if flag:
        cnt+=1

print(cnt)



