#DFS와 BFS
N, M, V = map(int, input().split())

graph = [[] for _ in range(N+1)]

for _ in range(M):
    v1, v2 = map(int, input().split())
    graph[v2].append(v1)
    graph[v1].append(v2)

# print(graph)

# dfs
lst = []
visited=[0]*(N+1)

def dfs(V):
    visited[V] = 1
    lst.append(V)
    graph[V].sort()
    for i in graph[V]:
        if visited[i] == 0:
            dfs(i)

dfs(V)
print(*lst)


# bfs
q = []
q.append(V)
visited = [0]*(N+1)
# print(visited)
visited[V] = 1
lst = []
lst.append(V)

while q:
    tmp = q.pop(0)
    graph[tmp].sort()
    for i in graph[tmp]:
        if visited[i] == 0:
            q.append(i)
            visited[i] = 1
            lst.append(i)

print(*lst)