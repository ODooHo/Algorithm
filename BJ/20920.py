import sys

input = sys.stdin.readline

N,M = map(int,input().split())

word = {}


for i in range(N):
    temp = input().strip()
    if len(temp) < M:
        pass
    else:
        if temp not in word:
            word[temp] = 1
        else:
            word[temp] +=1

#item 빼오고, lambda로 순서대로 정렬하는 방법 숙지하기

sorted_word = sorted(word.items(), key=lambda x: (-x[1], -len(x[0]), x[0]))

result = []
for item in sorted_word:
    result.append(item[0])

for i in range(len(result)):
    print(result[i])