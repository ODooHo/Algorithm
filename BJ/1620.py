import sys

N, M = map(int, input().split())
num = 1
pokemon_dict1 = {} #숫자 입력 시 사용할 dict
pokemon_dict2 = {} #이름 입력 시 사용할 dict

for _ in range(N):
    name = str(sys.stdin.readline()).strip() #\n(공백)없애기
    pokemon_dict1[num] = name
    pokemon_dict2[name] = num
    num += 1

answer = []
for _ in range(M):
    pokemon = str(sys.stdin.readline()).strip()
    if pokemon.isdigit():
        print(pokemon_dict1[int(pokemon)])
    else:
        print(pokemon_dict2[pokemon])