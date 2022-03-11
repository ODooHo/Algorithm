import sys

def heapify(unsorted,index,heap_size):
    largest = index
    left_index= 2 * index+1
    right_index = 2 * index +2
    if left_index <heap_size and unsorted[left_index] > unsorted[largest]:
        largest = left_index
    if right_index < heap_size and unsorted[right_index] > unsorted[largest]:
        largest = right_index
    if largest != index:
        unsorted[largest], unsorted[index] = unsorted[index], unsorted[largest]
        heapify(unsorted, largest, heap_size)




def heap_sort(unsorted):
    n = len(unsorted)
    # Max_Heap 을 구성하는 단계.
    # 인덱스 : (n을 2로 나눈 몫-1)~0
    # 최초로 힙 구성시 배열의 중간부터 시작하면 이진트리의 성질에 의해
    # 모든 요소의 값을 한번씩 비교할 수 있다.
    for i in range(n //2 - 1, -1, -1):
        heapify(unsorted,i,n)
    #만들어진 Heap 을 정렬하는 단계
    #최악의 경우 트리의 높이(logn)만큼의 자리 이동을 하는데,
    #노드가 n개 존재함으로 O(nlogn)만큼의 시간이 든다.
    for i in range(n -1, 0, -1):
        unsorted[0], unsorted[i] = unsorted[i], unsorted[0] #가장 큰 노드가 0에 위치함으로, 하나씩 바꿔주는 과정
        heapify(unsorted,0,i)

    return unsorted




N = int(input())
time = 0 #누적 시간
pre = 0#이전 시간
per = list(map(int,sys.stdin.readline().split()))

per = heap_sort(per)
for i in range(N):
    pre=sum(per[:i])
    time += pre + per[i]

print(time)
