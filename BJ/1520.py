import sys
sys.setrecursionlimit(10**6)  #재귀 구현할 때 필수적인 문장.
input = sys.stdin.readline
m, n = map(int, sys.stdin.readline().split())
matrix = []
for _ in range(m):
    matrix.append(list(map(int, sys.stdin.readline().split())))


dx = [0, +1, 0, -1] #동 남 서 북
dy = [+1, 0, -1, 0]
dp = [[-1]*n for _ in range(m)] #뒤에서부터 저장 -> 거꾸로 탐색할 것이기 때문
                                #visited 개념으로 사용하였다.
dp[0][0] = 1
def dfs(x, y):
    global matrix
    global dp
    step = matrix[x][y]
    if x == 0 and y == 0:
        return 1
    if dp[x][y] == -1:      #0으로 시작하면, 많이 겹치게됨
        dp[x][y] += 1
        for i in range(4):  #4방향 탐색
            a, b = x + dx[i], y + dy[i] #a,b 현재 탐색중인 x,y 좌표
            if 0 <= a < m and 0 <= b < n:
                temp = matrix[a][b]
                if temp > step:    # 더 낮은 계단칸
                    dp[x][y] += dfs(a, b)
    return dp[x][y]


result = dfs(m-1, n-1) #거꾸로 실행 목표 지점 부터 시작지점까지.
print(result)




