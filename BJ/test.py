import sys

input = sys.stdin.readline

def reverse(result):
    if len(result)==0:
        exit()
    else:
        print(result[len(result)-1:])
        result = result[:-1]
        reverse(result)

result = input().rstrip()
reverse(result)