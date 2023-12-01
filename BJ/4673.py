import sys

input = sys.stdin.readline


temp = list(i for i in range(1,10001))

exclude = []



for num in temp:
    res = 0
    for n in str(num):
        num += int(n)
    if num <= 10000:
        exclude.append(num)

for remove_num in set(exclude):
    temp.remove(remove_num)

for i in temp:
    print(i)