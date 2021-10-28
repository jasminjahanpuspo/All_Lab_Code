
class priorityQueue:
    def __init__(self):
        self.pq=[]
        
    def enqueue(self,node,priority):
        self.pq.append(node,priority)
    
    def dequeue(self):
        self.pq.sort(key=itemgetter(1))
        return self.pq.pop(0)
    def isEmpty(self):
        return (self.pq==[])


class Node:
    def __init__(self,curNode,parNode,pathCost):
        self.c=crNode
        self.p=parNode
        self.pc=pathCost
        
        
class Problem:
    def __init__(self,statespace,istate,gstates):
        self.ss=statespace
        self.i=istate
        self.g=gstates
        
    def goal(self,node):
        if(self.g==None):
            return False
        elif(node in self.g):
            return True
        
        
        
        
class vertex:
    def __init__(self,vName,hValue):
        self.v=vName
        self.h=hValue
        self.adjacencyList={}
        
    def addNeighbour(self,targetNode,weight):
        self.adjacencyList[targetNode]=weight
        
    def successor(self):
         return list(self.adjacencyList.items())
     
class graph:
    def __init__(self):
        self.vertices={}
        self.numberOfVertex=0
        
    def addvertex(self,key,heuristic):
        vertexObject=vertex(key,heuristic)
        self.vertices[key]=vertexObject
        self.numberOfVertex+=1
        
    def adddEdge(self,firstVertex,secondVertex,weight):
        if firstVertex not in self.vertices:
#        s='heuristic of "'+secondVertex'":'
            h=eval(input())
            self.addVertex(firstVertex,h)
            
        self.vertices[firstVertex].addNeighbour(secondVertex,weight)
        
        
    
    def allVertexObject(self):
        return list(self.vertices.values())



#if __name__=='__main__':
#    g=createStateSpaceGraph()
#    problem=problem(statespace=g,istate=g.vertices['s'].state,
#                    gstates=[g.vertices['g1'].state,g.vertices['g2'].state])
#    
#    u=uniformedsearch()
#    
#    uSearch.printGraph(problem)
#    problem1=problem(statespace=g,istate=g.vertices['s'].state,
#                     gstates=g.vertices['g3'].state)
#    uSearch.BFS()
#        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        