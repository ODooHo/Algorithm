def check_strike_ball(secret_number,answer_number):
    strike = 0
    ball = 0
    for i in range(len(secret_number)):
        for j in range(len(secret_number)):
            if secret_number[i] == answer_number[j]:
                if i == j:
                    strike +=1
                else:
                    ball +=1
    return [strike,ball]


print(check_strike_ball([1,2,3],[1,3,2]))
print(check_strike_ball([1,2,3],[4,5,6]))