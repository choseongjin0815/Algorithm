#n%k == 0일때는 n/=k연산 가능 else n-=1연산
n, k = map(int, input().split())
#그냥 나눌 수 있을때 무조건 나누는게 최소 횟수 k>=2가 조건이므로
cnt = 0 # 연산 횟수
while n != 1:
    if n % k == 0 :
        n /= k
        cnt += 1
    else : 
        n -= 1
        cnt += 1

print(cnt)