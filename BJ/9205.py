<<<<<<< HEAD
=======
from collections import deque

>>>>>>> 9990b0382fa43d4075bffb9cb9dc342400dcfa19
import sys

input = sys.stdin.readline


<<<<<<< HEAD
T = int(input())

for _ in range(T):
    n = int(input())
=======
t = int(input())

for _ in range(t):
    n = int(input())
    songdo = []

    for i in range(n+2):
        x,y = map(int,input().split())
        songdo.append((x,y))

    print(songdo)
>>>>>>> 9990b0382fa43d4075bffb9cb9dc342400dcfa19
