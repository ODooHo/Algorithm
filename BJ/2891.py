n,s,r = map(int,input().split())

team = [1 for _ in range(n)]
count=0
broken = list(map(int,input().split()))

for i in broken:
    team[i-1] -=1

sub = list(map(int,input().split()))

for i in sub:
    team[i-1] +=1

for k in range(1,n):
    if team[k] == 0:
        if k == 0:
            if team[k + 1] == 2:
                team[k + 1] = 1
                team[k] = 1
        elif k == len(team) - 1:
            if team[k - 1] == 2:
                team[k - 1] = 1
                team[k] = 1
        else:
            if team[k - 1] == 2:
                team[k - 1] = 1
                team[k] = 1
                continue
            if team[k + 1] == 2:
                team[k + 1] = 1
                team[k] = 1
                continue
    else:
        continue
a = team.count(0)
print(a)