#n개의 행과 m개의 열
n, m = map(int, input().split())

lst = []
#각 행 별로 가장 작은 값을 담을 리스트
row_min = []
for i in range(n) :
    lst.append(list(map(int, input().split()))) 
    row_min.append(min(lst[i]))

#가장 큰 값을 출력
print(max(row_min))
