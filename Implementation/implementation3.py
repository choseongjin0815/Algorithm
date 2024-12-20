#ch = []

# for i in range(8) : 
#     ch.append([])
#     for j in range(8) :
#         ch[i].append([chr(97+i),j+1])

point = input()

cnt = 0
move = [[1,2], [-1,2], [1,-2], [-1,-2], [2,-1], [2,1], [-2,1], [-2,-1]]
for i in range(8) : 
    if ord(point[0]) - 96 + move[i][0] > 0 and int(point[1]) + move[i][1] > 0 \
    and ord(point[0]) - 96 + move[i][0] < 8 and int(point[1]) + move[i][1] < 8 :
        cnt += 1
print(cnt)