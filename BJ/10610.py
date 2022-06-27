N = input()
temp = 0

cmp = sorted(N,reverse=True)


if "0" not in N:
    print(-1)
else:
    for i in range(len(N)):
        temp += int(N[i])

    if temp%3 == 0:
        result = "".join(cmp)
        print(result)
    else:
        print(-1)