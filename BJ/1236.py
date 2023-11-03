import sys

input = sys.stdin.readline


n,m = map(int,input().split())


graph = [input().strip() for _ in range(n)]


check = []

cntC = 0
cntL = 0


for i in range(n):
    if not 'X' in graph[i]:
        cntC +=1

for i in range(n):
    for j in range(m):
        check.append(graph[i][j])
    
    if not 'X' in check:
        cntL +=1
        check = []
    else:
        check = []

print(max(cntC,cntL))


n, m = map(int, input().split())
array = []

for _ in range(n):
    array.append(input())

row_count, col_count = 0, 0

for i in range(n):
    if 'X' not in array[i] :
        row_count += 1
        
for j in range(m):
    if "X" not in [array[i][j] for i in range(n)]:        
        col_count += 1
print(max(row_count, col_count))