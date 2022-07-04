N = int(input())

oct = [1,2]*(N//2)+([3] if N%2 else [])

print(*oct)

