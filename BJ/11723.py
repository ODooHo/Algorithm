import sys

input = sys.stdin.readline

def add(S,x):
    S.add(x)

def remove(S,x):
    S.discard(x)

def check(S,x):
    if x in S:
       print(1)
    else:
        print(0) 

def toggle(S,x):
    if x in S:
        S.discard(x)
    else:
        S.add(x)

def all(S):
    S = set([i for i in range(1,21)])
    return S
def empty(S):
    S = set()
    return S


M = int(input())

S = set()


for i in range(M):
    a = input().rstrip()
    if(a.find(" ") != -1):
        a,b = a.split()
        b = int(b)
        if a == "add":
            add(S,b)
        elif a == "check":
            check(S,b)
        elif a == "remove":
            remove(S,b)
        elif a == "toggle":
            toggle(S,b)
    else:
        if a == "all":
            S = all(S)
        elif a == "empty":
            S = empty(S)




