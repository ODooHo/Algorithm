s1, s2, s3 = map(int, input().split())
li = [0]*81 #주사위의 면의 최대값은 s1,s2,s3 각각 20,20,40 =80 이기 때문에,
for i in range(1, s1+1):
    for j in range(1, s2+1):
        for k in range(1, s3+1):
            li[i+j+k] += 1
print(li.index(max(li)))
