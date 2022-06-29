A,B = map(int,input().split())
N = int(input())
button = [0 for _ in range(N)]
cnt=0
for i in range(N):
    button[i]=int(input())

sum1 = abs(B-A)

for i in range(N):
    button[i]= abs(B-button[i])
sum2 = min(button)

print(min(sum1,sum2+1))