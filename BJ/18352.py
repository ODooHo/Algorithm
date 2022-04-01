import sys
import heapq


input =  sys.stdin.readline

n,m,k,x = map(int,input().split())
INF = 1000000000
distance = [INF] * (n+1)
cnt = 0
graph = [[]for _ in range(n+1)]
for _ in range(m):
    u,v = map(int,input().split())
    graph[u].append((v,1))

def dijkstra(start):
    global cnt
    queue = []
    heapq.heappush(queue,(0,start))
    distance[start] = 0
    while queue:
        dist, node = heapq.heappop(queue)
        if distance[node]== k:
            cnt+=1
        if distance[node] < dist:
            continue
        for next in graph[node]:
            cost = distance[node] + next[1]
            if cost < distance[next[0]]:
                distance[next[0]] = cost
                heapq.heappush(queue,(cost,next[0]))

dijkstra(x)
if cnt<=0:
    print(-1)
else:
    for i in range(1,n+1):
        if distance[i] == k:
            print(i)

