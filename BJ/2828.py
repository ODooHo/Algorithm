N,M = map(int,input().split())
J = int(input())
start = 1
end = M
distance = 0


for _ in range(J):
    p = int(input())

    if p < start:
        distance +=(start-p)
        start = p
        end = p+M-1
    elif p>end:
        distance +=(p-end)
        end = p
        start = end - M + 1

print(distance)