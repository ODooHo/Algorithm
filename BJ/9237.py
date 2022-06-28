import sys


input = sys.stdin.readline


date = 1
N = int(input())
tree = list(map(int,input().split()))
tree = sorted(tree,reverse=True)
date += tree[0]
for i in range(1,len(tree)):
    if date < i+tree[i]+1: #i번째 묘목의 예상 만개일이, 가장 오래 걸리는 묘목의
        date = i+tree[i]+1 #만개일 보다 늦을 경우
print(date+1)  #이장은 다음날에 옴



