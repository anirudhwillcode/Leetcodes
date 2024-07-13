def dfs(graph,start,visited=None):
    if visited is None:
        visited=set()        #set() is an unordered collection of unique elements we initialize set to visited
    visited.add(start)
    print(start,end='')
    
    for nieghbor in graph[start]:
        if nieghbor not in visited:
            dfs(graph,nieghbor,visited)
    
 
 
 
 
graph={
     'A':['B','C'],
     'B':['D','E'],
     'C':['F'],
     'D':[],
     'E':['F'],
     'F':[]
 }

print(graph,'B')