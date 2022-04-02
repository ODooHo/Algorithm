import sys
import heapq

input = sys.stdin.readline
n, d = map(int,input().split())
INF = 1000000000
distance = [INF] * (d+1)
graph = [[]for i in range(10001)]
for i in range(d):
    graph[i].append((i+1,1))
for _ in range(n):
    u,v,c = map(int,input().split())
    if v > d :
        continue
    graph[u].append((v,c))

def dijkstra(start):
    queue = []
    heapq.heappush(queue,(0,start))
    distance[start] = 0
    while queue:
        dist, node = heapq.heappop(queue)
        if distance[node] < dist:
            continue
        for next in graph[node]:
            cost = distance[node] + next[1]
            if cost < distance[next[0]]:
                distance[next[0]] = cost
                heapq.heappush(queue,(cost,next[0]))


dijkstra(0)
print(distance[d])