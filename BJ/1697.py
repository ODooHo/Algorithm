import sys
import heapq

input = sys.stdin.readline

n, k = map(int, input().split())
visited = [False] * 100001
visited[n] = True
queue = []
heapq.heappush(queue,(0,n))

while queue:
    dist, node = heapq.heappop(queue)
    if node == k:
        print(dist)
        break
    next = node * 2
    if next < len(visited) and not visited[next]:
        visited[next] = True
        heapq.heappush(queue, (dist + 1, next))

    for i in (node + 1, node - 1):
        if i >= 0 and i < len(visited) and not visited[i]:
            visited[i] = True
            heapq.heappush(queue, (dist + 1, i))