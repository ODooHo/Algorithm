import sys

input = sys.stdin.readline 


N = int(input())

distance = list(map(int,input().split()))

oil = list(map(int,input().split()))


cheap = oil[0]

result = 0

for i in range(1,len(oil)):
    if cheap > oil[i]:
        result += cheap * distance[i-1]
        cheap = oil[i]
    else:
        result += cheap * distance[i-1]

    
print(result)