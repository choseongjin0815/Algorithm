array = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]
def quick_sort(array, start, end) :
    #원소가 한개일 경우 종료
    if start >= end :
        return
    pivot = start
    left = start + 1
    right = end
    
    while left <= right : 
        #피벗보다 큰 데이터를 찾을 때 까지 반복 
        while left <= end and array[left] <= array[pivot] :
            left += 1
        while right > start and array[right] >= array[pivot] :
            right -= 1
        if left > right :
            array[right], array[pivot] = array[pivot], array[right]
        else :
            array[right], array[left] = array[left], array[right]
    
    quick_sort(array, start, right - 1)
    quick_sort(array, right + 1, end)
    




quick_sort(array, 0, len(array) - 1)

print(array)
