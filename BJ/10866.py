import sys
from collections import deque

input = sys.stdin.readline



def push_front(temp,X):
    temp.appendleft(X)

def push_back(temp,X):
    temp.append(X)

def pop_front(temp):
    if len(temp) == 0:
        print(-1)
    else:
        print(temp.popleft())

def pop_back(temp):
    if len(temp) == 0:
        print(-1)
    else:
        print(temp.pop())

def size(temp):
    print(len(temp))

def empty(temp):
    if len(temp) == 0:
        print(1)
    else:
        print(0)
def front(temp):
    if len(temp) == 0:
        print(-1)
    else:
        print(temp[0])

def back(temp):
    if len(temp) == 0:
        print(-1)
    else:
        print(temp[-1])

N = int(input())

temp = deque([])
for i in range(N):
    a = input().split()
    param = a[0]
    
    if param == 'push_back':
        push_back(temp,a[1])
    elif param == 'push_front':
        push_front(temp,a[1])
    elif param == 'front':
        front(temp)
    elif param == 'back':
        back(temp)
    elif param == 'empty':
        empty(temp)
    elif param == 'size':
        size(temp)
    elif param == 'pop_front':
        pop_front(temp)
    elif param == 'pop_back':
        pop_back(temp)