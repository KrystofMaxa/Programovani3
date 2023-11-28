from numpy import Inf 

graph = {
    0:[(1,1)],
    1:[(0,1), (2,2), (3,3)],
    2:[(1,2), (3,2), (4,5)],
    3:[(1,3), (2,1), (4,1)],
    4:[(2,5), (3,1)]  
}

def naive_dijkstras(graph, root):
    n = len(graph) #zjistime velikost grafu
    # initialize distance list as all infinities
    dist = [Inf for _ in range(n)] #nastavime velikost seznamu na nekonecno

    # set the distance for the root to be 0
    dist[root] = 0

    # initialize list of visited nodes, nastavi vsechny zaznamy na false, protoze jsme tam nebyli
    visited = [False for _ in range(n)]     #seznam navstivenych uzlu nastaven = vsechny jsou nula
    
    # loop through all the nodes, prochazime for od prvniho do nteho uzlu, co se deje? zaciname zjistovat nejkratsi vzdalenost 
    for _ in range(n):
        # "start" our node as -1 (so we don't have a start/next node yet)
        u = -1 #nejkratsi?

        # loop through all the nodes to check for visitation status, musime to projit n * n => dva forcykly, kvadraticka slozitost 
        for i in range(n):
            # if the node 'i' hasn't been visited and
            # we haven't processed it or the distance we have for it is less
            # than the distance we have to the "start" node
            if not visited[i] and (u == -1 or dist[i] < dist[u]):
                u = i # pokud je nejaka cesta kratsi, tak ji pouzij 

        # all the nodes have been visited or we can't reach this node, nastavit jako nedosazitelny
        if dist[u] == Inf:
            break
    
        # set the node as visited
        visited[u] = True

        # compare the distance to each node from the "start" node
        # to the distance we currently have on file for it
        for v, l in graph[u]:
            if dist[u] + l < dist[v]:
                dist[v] = dist[u] + l

    return dist

print(naive_dijkstras(graph, 1))
    
    
    
    
    
    
