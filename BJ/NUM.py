import random


answer_list = []

def make_random_number():
    num_list = [0,1,2,3,4,5,6,7,8,9]
    random.shuffle(num_list)
    return(num_list.pop(),num_list.pop(),num_list.pop())



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

answer_list = list(make_random_number())
print(answer_list)
cnt = 1
while(1):
    num = int(input())
    secret = [0, 0, 0]
    for i in range(2, -1, -1):
        secret[i] = num % 10
        num = num // 10
    print(f"your answer is...[{secret[0]}, {secret[1]}, {secret[2]}]")
    a,b = check_strike_ball(secret,answer_list)
    print(a,"strike and",b,"ball")
    if (secret == answer_list):
        break
    cnt+=1

print("The number of trials is %d." %cnt)
print("The answer is [%d, %d, %d]." %(answer_list[0],answer_list[1],answer_list[2]))

