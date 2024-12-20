n = int(input())
# 각 시간별 3있는지 확인하는 카운트
hCnt = 0
mCnt = 0
sCnt = 0
# 결과값
res = 0
# if n <= 24 :
#     for i in range(n+1) :
#         if i == 3 or i == 13 or i == 23 :
#             hCnt += 1
#         for j in range(60) :
#             if j // 10 == 3 or j % 10 == 3 :
#                 mCnt += 1
#             for k in range(60) : 
#                  if k // 10 == 3 or k % 10 == 3 :
#                      sCnt += 1
#                  if hCnt != 0 or mCnt != 0 or sCnt != 0 :
#                      res += 1
                
#                  sCnt = 0
#             mCnt = 0
#         hCnt = 0         

for i in range(n+1) :
    for j in range (60) :
        for k in range(60) :
            if '3' in str(i) + str(j) + str(k) : 
                res += 1

print(res)