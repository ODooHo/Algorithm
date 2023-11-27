A = input().lower()
word_list = list(set(A))


answer = []

for i in word_list:
    count = A.count(i)
    answer.append(count)

if answer.count(max(answer))>=2:
    print("?")
else :
    print(word_list[(answer.index(max(answer)))].upper())