N = int(input())

line = 0
maximum = 0
while N > maximum:
    line +=1
    maximum += line
gap = maximum-N
if line % 2 == 0:
    top = line - gap
    bottom = gap + 1
else:
    top = gap + 1
    bottom = line - gap
print(f"{top}/{bottom}")