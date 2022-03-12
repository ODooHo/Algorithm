def dfs(graph, v, visited):  # v = 현재 탐색 노드
    visited[v] = True  # 현재 노드를 방문 처리
    print(v, end=' ')
    for i in graph[v]:  # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        if not visited[i]:
            dfs(graph, i, visited)


visited = [False] * 11  # 노드의 개수 +1개의 bool타입 리스트 생성 방문 여부를 체크하기 위함
graph = [
    [],
    [2, 5, 9],
    [1, 3, 4],
    [2, 4],
    [3],
    [1, 6, 8],
    [5, 7],
    [6],
    [5],
    [1, 10],
    [9]
]
dfs(graph, 1, visited)
