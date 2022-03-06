result=[0,0,0]
for i in range(3):
    num = []
    N = int(input())
    for j in range(N):
        a = int(input())
        num.append(a)
    for k in range(len(num)):
        result[i]+=num[k]
for z in range(3):
    if result[z]>0:
        print("+")
    elif result[z]<0:
        print("-")
    else:
        print("0")
