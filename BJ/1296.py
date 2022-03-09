YD = input()
N = int(input())
teamName=[]
A= []
for i in range(N):
    temp=input()
    teamName.append(temp)
teamName.sort()
for w in teamName:
    L = w.count('L') + YD.count('L')
    O = w.count('O') + YD.count('O')
    V = w.count('V') + YD.count('V')
    E = w.count('E') + YD.count('E')

    A.append((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)%100)

print(teamName[A.index(max(A))])