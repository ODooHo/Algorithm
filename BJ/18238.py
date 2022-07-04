word = list(input())

start = "A"
time = 0

for i in word:
    left = ord(i)-ord(start)
    right = ord(start)-ord(i)

    if left < 0:
        left += 26
    elif right < 0:
        right += 26

    time += min(left,right)
    start = i

print(time)