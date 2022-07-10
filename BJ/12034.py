import sys

input = sys.stdin.readline

T = int(input())

for i in range(T):
    N = int(input())
    tag = list(map(int,input().split()))
    discount = []
    while True:
        if tag[-1] *(3/4) in tag:
            discount.append(tag.pop(tag.index(tag[-1]*3/4)))
            tag.pop(-1)
        if len(discount)==N:
            break
    print(f"Case #{i+1}: ",end="")
    print(*sorted(discount))


