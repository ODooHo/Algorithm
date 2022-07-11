import sys

input = sys.stdin.readline

N = int(input())

drink = []
for i in range(N):
    drink.append(int(input()))
drink = sorted(drink)
temp = 0
while True:
    if len(drink)>=3:
        for _ in range(2):
            temp += drink.pop()
        drink.pop()
    elif len(drink)==2:
        for _ in range(2):
            temp+=drink.pop()
    elif len(drink)==1:
        temp+=drink.pop()
    else:
        break
print(temp)
