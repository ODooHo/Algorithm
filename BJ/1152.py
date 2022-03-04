A=input()
c=A[0]
if c==" ":
    counter = 0
else:
    counter = 1
for i in range(len(A)):
    if A[i]==" ":
        counter=counter+1
if A[i]==" ":
    counter=counter-1
print(counter)