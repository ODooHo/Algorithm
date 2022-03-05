import sys
#input() 의 속도가 느리기 때문에, sys.stdin.readline()을 사용한다.
N = int(input())

unsorted = [0] * 10001

for i in range(N):
    n = int(sys.stdin.readline())
    unsorted[n] = unsorted[n]+1

for i in range(10001):
    if unsorted[i] != 0:
        for j in range(unsorted[i]):
            print(i)
print(unsorted)