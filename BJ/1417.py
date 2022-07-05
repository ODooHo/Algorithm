import sys

input = sys.stdin.readline

N = int(input())
count = 0

candidate = list(int(input())for _ in range(N))
dasom = candidate.pop(0)
candidate = sorted(candidate,reverse= True)
if N == 1:
    print(0)
else:
    while candidate[0]>=dasom:
        candidate[0] -= 1
        dasom+=1
        count+=1
        candidate = sorted(candidate,reverse=True)
    print(count)
