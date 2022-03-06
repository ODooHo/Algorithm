Month,D,Y,T = input().split()
D = int(D[:-1]) #, 제외하고 저장
Y = int(Y)
H , M = map(int,T.split(":")) #시, 분을 :를 기준으로 나눔
month_name = ["January","February","March","April","May","June","July","August","September",
              "October","November","December"]
month_day =[31,28,31,30,31,30,31,31,30,31,30,31]
if Y%400==0 or (Y%4==0 and Y%100!=0):#윤년 계산
    month_day[1]+=1
time = sum(month_day)*24*60 #전체 시간의 합.

last_month_idx = month_name.index(Month) #몇달이 지났는지 계산
current_time = (sum(month_day[:last_month_idx]) + D-1)*24*60 + H*60 + M #D-1 은 당일 제외.
print(current_time/time * 100)