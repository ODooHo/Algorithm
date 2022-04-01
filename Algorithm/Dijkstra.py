import sys
import heapq


input = sys.stdin.readline
n, m = map(int, input().split())
start = int(input())
INF = 1000000000
distance = [INF] * (n+1)
graph = [[] for _ in range(n+1)]
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b, c)) #-> 튜플


def dijkstra(start):
    queue = []
    heapq.heappush(queue, (0, start))  # 시작노드 정보 우선순위 큐에 삽입
    distance[start] = 0            # 시작노드->시작노드 거리 기록
    while queue:
        dist, node = heapq.heappop(queue)
        # 큐에서 뽑아낸 거리가 이미 갱신된 거리보다 클 경우(=방문한 셈) 무시
        if distance[node] < dist:
            continue
        # 큐에서 뽑아낸 노드와 연결된 인접노드들 탐색
        for next in graph[node]: #next[0]=노드, next[1]=거리(간선 비용) -> 튜플
           cost = distance[node] + next[1]   # 시작->node거리 + node->node의인접노드 거리
           if cost < distance[next[0]]:      # cost < 시작->node의인접노드 거리
                distance[next[0]] = cost
                heapq.heappush(queue, (cost, next[0]))


dijkstra(start)

for i in range(1, len(distance)):
    if distance[i] == INF:
        print('INF')
    else:
        print(distance[i])