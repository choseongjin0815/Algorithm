n = int(input())
# l,u 는 연산 결과가 0이 되면 안됨, r,d는 연산 결과가 n+1이 되면 안됨 
l = [0,-1]
r = [0,1]
u = [-1,0]
d = [1, 0]
#지도
m = []
res = [1,1]
for i in range(1, n+1) :
    m.append([])
    for j in range(1, n+1) :
        m[i-1].append([i,j])

#명령어 입력
command = input().split()

for i in range(len(command)) : 

    if command[i] == 'R':
        if res[1] + r[1] != 5 :
            res[1] += 1 
    elif command[i] == 'L' :
        if res[1] + l[1] != 0 :
            res[1] -= 1
    elif command[i] == 'U' :
        if res[0] + u[0] != 0 :
            res[0] -= 1
    elif command[i] == 'D' :         
        if res[0] + d[0] != 5 :
            res[0] += 1

print(res[0], res[1])    
     


