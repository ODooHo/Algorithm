import sys


input = sys.stdin.readline



N,score,P = map(int,input().split())


if N == 0:
    print(1)
else:
    ranking = list(map(int,input().split()))
    if N == P and ranking[-1] >= score:
        print(-1)
    else:
        result = N + 1
        for i in range(N):
            if ranking[i] <= score:
                result = i + 1
                break
        
        print(result)


# flag = False

# same = False
# if (N == 0):
#     print(1)
# else:
#     ranking = list(map(int,input().split()))
#     for i in range(len(ranking)):
#         if not same and ranking[i] == score:
#             same = True
#             temp = i+1
#         if same and ranking[i] < score:
#             print(temp)
#             flag = True
#             break
#         elif not same and ranking[i] < score:
#             print(i+1)
#             flag = True
#             break
#     if not flag:
#         if len(ranking) < P:
#             ranking.append(score)
#             print(len(ranking))
#         else:
#             print(-1)
