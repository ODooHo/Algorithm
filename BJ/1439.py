S = input()
space = 0

for i in range(len(S)-1):
    if S[i] != S[i+1]:
        space+=1

result = (space+1)//2

print(result)