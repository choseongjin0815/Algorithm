#배열의 크기 N, 숫자가 더해지는 횟수 M, 연속해서 더해질 수 있는 횟수 K

N, M, K = map(int,input().split())
lst = list(map(int, input().split()))
res = 0
#오름차순으로 정렬
lst.sort()

#가장 큰 수 와 두번째로 큰 수를 더해준다.
first = lst[N-1]
second = lst[N-2]


while True : 
    for i in range(K) :
        if M == 0 : break
        res += first
        M -= 1
    if M == 0 : break
    res += second
    M -= 1

print(res)