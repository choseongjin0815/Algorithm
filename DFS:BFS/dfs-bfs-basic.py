from collections import deque
def dfs(graph, v, visited) :
    visited[v] = True
    print(v, end=' ')
    
    for i in graph[v] : 
        if not visited[i] : 
            dfs(graph, i, visited)

def bfs(graph, start, visited) :
    queue = deque([start])
    
    visited[start] = True
    
    while queue : 
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v] :
            if not visited[i] :
                queue.append(i)
                visited[i] = True
    

graph = [
    [],
    [2,3,8],
    [1,7],
    [1,4,5],
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
]
print("DFS")
visited = [False] * 9
dfs(graph, 1, visited)

print("\nBFS")
visited = [False] * 9
bfs(graph, 1, visited)