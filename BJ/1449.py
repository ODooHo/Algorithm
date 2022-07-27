import sys

input = sys.stdin.readline

N, L = map(int,input().split())

pipe = list(map(int,input().split()))

pipe = sorted(pipe)

start = pipe[0]
end = pipe[0] + L
count = 1

for i in range(N):
    if start<=pipe[i]<end:
        continue
    else:
        start = pipe[i]
        end = pipe[i] + L
        count+=1

print(count)
