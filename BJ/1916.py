import sys
import heapq


input =  sys.stdin.readline

n = int(input())
m = int(input())

INF = 1000000000
distance = [INF] * (n+1)
graph = [[]for _ in range(n+1)]
for _ in range(m):
    u,v,c = map(int,input().split())
    graph[u].append((v,c))
start,arrival = map(int,input().split())

def dijkstra(start):
    queue = []
    heapq.heappush(queue,(0,start))
    distance[start] = 0
    while queue:
        dist,node = heapq.heappop(queue)
        if node == arrival:
            print(distance[node])
            return
        if distance[node] < dist:
            continue

        for next in graph[node]:
            cost = distance[node] + next[1]
            if cost < distance[next[0]]:
                distance[next[0]] = cost
                heapq.heappush(queue,(cost,next[0]))

dijkstra(start)