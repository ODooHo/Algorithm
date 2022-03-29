counter = 1000
N = int(input())
cash = 0
counter = counter-N

cash += counter//500
counter = counter%500
cash += counter//100
counter = counter%100
cash += counter//50
counter = counter%50
cash += counter//10
counter = counter%10
cash += counter//5
counter = counter%5
cash += counter//1
counter = counter%1

print(cash)