import sys
T = int(input())
for i in range(T):
    n = int(sys.stdin.readline())
    count0 = 1
    count1 = 0
    temp = 0
    for _ in range(n):
        temp = count1
        count1 = count1 + count0
        count0 = temp
    print(count0, count1)