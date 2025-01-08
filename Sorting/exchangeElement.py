n, k = map(int, input().split())

#a의 max와 b의 min을 교체
#a는 오름차순으로 정렬
#b는 내림차순으로 정렬
#이후 인덱스 순서대로 비교 후 교체

a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort(reverse=True)

for i in range(k) :
    if a[i] < b[i]:
        a[i], b[i] = b[i], a[i]

print(sum(a))