N = int(input())
cnt=0
people = input()
for i in range(len(people)):
    if people[i]=="L":
        cnt+=1

if cnt == 0:
    print(N)
else:
    print(N-(cnt//2-1))