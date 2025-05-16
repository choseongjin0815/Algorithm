def binary_search(array, target, start, end) :
    if start > end :
        return
    mid = (start + end) // 2
     
    if array[mid] == target : 
        return mid
    elif array[mid] > target :
        return binary_search(array, target, start, mid-1)
    else :
        return binary_search(array, target, mid+1, end)
    
    
    


#원소의 개수와 target 입력받기
n, target = list(map(int, input().split()))

array = list(map(int, input().split()))

result = binary_search(array, target, 0, n-1)

if result != None :
    print(result+1)
else : 
    print("일치하는 수가 없습니다.")


