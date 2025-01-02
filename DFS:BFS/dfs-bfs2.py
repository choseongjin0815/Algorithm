from collections import deque


# dn = [1,-1,0,0]
# dm = [0,0,-1,1]    
    

# #n,m 크기의 직사각형 
# n, m = map(int, input().split())
# #못가는 부분은 0 갈 수 있는 부분은 1
# graph = []

# for i in range(n) :
#     graph.append(list(map(int, input())))

# def bfs(y,x) :
#     queue = deque()
#     queue.append((y,x))
    
#     while queue : 
#         y, x = queue.popleft()
        
#         for i in range(4) :
#             ny = y + dn[i]
#             nx = x + dm[i]
            
#             if ny < 0 or nx < 0 or ny >= n or nx >= m :
#                 continue
#             if graph[ny][nx] == 0 :
#                 continue
            
#             if graph[ny][nx] == 1 :
#                 graph[ny][nx] = graph[y][x] + 1
#                 queue.append((ny, nx))
#     return graph[n-1][m-1]



# print(bfs(0,0))

# for g in graph :
#     print(g)

dy = [1,-1,0,0]
dx = [0,0,-1,1]

n, m = map(int, input().split())

graph = []
for i in range(n) :
    graph.append(list(map(int, input())))
    
def bfs(y,x) :
    queue = deque()
    queue.append((y,x))
    while queue : 
        (y,x) = queue.popleft()
        #상하 좌우 
        for i in range(4) :
            ny = y + dy[i]
            nx = x + dx[i]
            if ny < 0 or nx < 0 or ny >= n or nx >= m :
                continue
            if graph[ny][nx] == 0:
                continue
            if graph[ny][nx] == 1:
                graph[ny][nx] = graph[y][x] + 1
                queue.append((ny,nx))        
    return graph[n-1][m-1]
        
        
print(bfs(0,0))
        
    
        


