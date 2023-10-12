<<<<<<< HEAD
=======
a = list(map(int, input().split()))
j = 0
if len(a) == 1:
    print("Good")
    exit()
else:
    while j != len(a) - 1:
        if a[j] <= a[j + 1]:
            j += 1
        else:
            print("Bad")
            exit()

    print("Good")
>>>>>>> 1968b9d4a2b0cf8eb4d988c1406a5f54babaa531
