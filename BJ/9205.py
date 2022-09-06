from collections import deque

import sys

input = sys.stdin.readline


t = int(input())

for _ in range(t):
    n = int(input())
    songdo = []

    for i in range(n+2):
        x,y = map(int,input().split())
        songdo.append((x,y))

    print(songdo)