array = [5,7,9,0,3,1,6,2,4,8]

def quick_sort(array) :
    #리스트가 하나의 원소만 담고 있으면 종료
    if len(array) <= 1 :
        return array
    
    pivot = array[0] #피벗은 첫 번째 원소
    tail = array[1:]# 피벗을 제외한 리스트
    
    left_side = [x for x in tail if x <= pivot] #tail에 있는 원소들인데 pivot보다 작은 애들
    right_side = [x for x in tail if x > pivot] #tail에 있는 원소들인데 pivot보다 큰 애들
    
    #왼쪽 부분 피벗 오른쪽 부분
    return quick_sort(left_side) + [pivot] + quick_sort(right_side)
    
    
    
    
    

print(quick_sort(array))