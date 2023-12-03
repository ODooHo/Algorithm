import sys

input = sys.stdin.readline


N = int(input())


stastics = []

check = {}


for i in range(N):
    temp = int(input())
    stastics.append(temp )


stastics.sort()

for t in stastics:
    if t in check:
        check[t] +=1
    else:
        check[t] = 1

high = max(check.values())

count = []



print(round(sum(stastics) / N))
print(stastics[len(stastics)//2])


for k,t in check.items():
    if t == high:
        count.append(k)

if len(count) > 1:
    print(count[1])
else:
    print(count[0])

print(max(stastics) - min(stastics))