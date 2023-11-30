import sys

input = sys.stdin.readline


S = list(input().strip())

zero = 0 
one = 0

zero = (S.count('0'))// 2
one = (S.count('1')) // 2 


for i in range(zero):
    S.pop(-(S[::-1].index('0'))-1)

for i in range(one):
    S.pop(S.index('1'))


print(''.join(S))