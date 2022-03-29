import sys

N = int(input())
rope = []
weight = []
for i in range(N):
    rope.append(int(sys.stdin.readline()))
rope.sort()
rope = list(reversed(rope))

for j in range(N):
    weight.append(rope[j]*(j+1))

print(max(weight))