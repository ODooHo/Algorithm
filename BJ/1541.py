num = input().split("-")

res1 = 0
res2 = 0

for i in num[0].split("+"):
    res1 +=int(i)

for i in num[1:]:
    for j in i.split("+"):
        res2+=int(j)

print(res1-res2)
