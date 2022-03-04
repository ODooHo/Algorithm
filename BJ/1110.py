N = int(input())
i=0
c=N

while True:
    b = c//10+c%10
    c = c%10*10+b%10;
    i = i+1
    if c==N:
        print(i);
        break




