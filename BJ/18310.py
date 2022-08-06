n = int(input())
house = []
house = list(map(int, input().rstrip().split()))
house.sort()
print(house[(n-1)//2]) #홀수일 때 고려