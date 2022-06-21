import random


answer_list = []

def make_random_number():
    for i in range(3):
        a = random.randint(1,9)
        answer_list.append(a)

    print(answer_list)

    return(answer_list[0],answer_list[1],answer_list[2])



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
    if strike==3:
        ball=0
    return [strike,ball]

make_random_number()


while(1):
    num = int(input("Your answer is..."))
    secret = [0,0,0]
    for i in range(2,-1,-1):
        secret[i] = num%10
        num = num//10
    a,b = check_strike_ball(secret,answer_list)
    print(a,"strike and",b,"ball")
    if(secret ==answer_list):
        break

print("The answer is [%d, %d, %d]." %(answer_list[0],answer_list[1],answer_list[2]))

