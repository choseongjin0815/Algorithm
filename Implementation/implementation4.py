# # N X M 사이즈 맵
# #각각의 칸은 육지(0) 혹은 바다(1)
# #캐릭터의 위치는 A,B로 나타내고
# #방향 0:북, 1:동, 2:남, 3:서

# n,m = map(int, input().split())
# #위치(r,c), d=방향
# r,c,d = map(int, input().split())
# #전체지도
# mp =[]
# #방문한곳인지 확인하기 위함
# already = []


# cnv = 0
# resCnt = 1
# for i in range(n) :
#     mp.append([])
#     already.append([])
#     mp[i] = list(map(int, input().split()))
    
#     for j in range(m) :
#         already[i].append(0)

# # print(mp)

# # print('=====')

# # print(already)    

# while True : 
#     #북
#     if d == 0 :
#         #방문한적이 없고 육지일 때
#         if already[r][c-1] == 0 and mp[r][c-1] == 0:
#             already[r][c-1] = 1
#             c -= 1
#             d = 3
#             cnv = 0
#             resCnt += 1      
#         else :
            
#             if cnv != 3 : d = 3
#             cnv += 1
#     #동
#     elif d == 1 :
#          #방문한적이 없고 육지일 때
#         if already[r-1][c] == 0 and mp[r-1][c] == 0:
#             already[r-1][c] = 1
#             r -= 1
#             d = 0     
#             cnv = 0   
#             resCnt += 1  
#         else :
            
#             if cnv != 3 : d = 0
#             cnv += 1
#     #남
#     elif d == 2 :
#          #방문한적이 없고 육지일 때
#         if already[r][c+1] == 0 and mp[r][c+1] == 0:
#             already[r][c+1] = 1
#             c += 1
#             d = 1  
#             cnv = 0
#             resCnt += 1        
#         else :
#             if cnv != 3 : d = 1
#             cnv += 1

#     #서
#     else :    
#          #방문한적이 없고 육지일 때
#         if already[r+1][c] == 0 and mp[r+1][c] == 0:
#             already[r+1][c] = 1
#             r += 1
#             d = 2     
#             cnv = 0
#             resCnt += 1     
#         else :
#             if cnv != 3 : d = 2
#             cnv += 1
    
#     if cnv == 4 : 
#         if d == 0 :
#             if mp[r+1][c] != 1 : 
#                 r += 1
#                 cnv = 0
#             else : break
#         elif d == 1 :
#              if mp[r][c-1] != 1:
#                  c -= 1
#                  cnv = 0
#              else : break
#         elif d == 2 :
#             if mp[r-1][c] != 1:
#                 r -= 1
#                 cnv = 0
#             else : break
#         else : 
#             if mp[r][c+1] != 1 :
#                 c += 1
#                 cnv = 0
#             else : break
# print(resCnt)   
