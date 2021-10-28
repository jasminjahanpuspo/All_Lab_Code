from operator import itemgetter

#The adjacencyList of a vertex is a dictionary whose key = vertexNaame ,value = weight
class vertex:
    def __init__(self,vName,hValue):
        self.state=vName
        self.heuristicValue=hValue
        self.adjacencyList={}
        
    #targetNeighbour is a vertexObject
    def addNeighbour(self,targetNeighbour,weight):
        self.adjacencyList[targetNeighbour]=weight
        
    def successors(self):
        return list(self.adjacencyList.items())
    
#The graph also has a verticies dictionary ,but this time each element has key=vertexName,
#value=vertexObject
class Graph:
    def __init__(self):
        self.vertices={}
        self.numberOfVertex=0
        
    def addVertex(self,key,heuristic):
        vertexObject=vertex(key,heuristic)
        self.vertices[key]=vertexObject
        self.numberOfVertex +=1
        
    def addEdge(self,firstVertex,secondVertex,weight=0):
        if firstVertex not in self.vertices:
            s='heuristic of "'+firstVertex+'": '
            h=eval(input(s))
            self.addVertex(firstVertex,h)
        if secondVertex not in self.vertices:
            s='heuristic of "'+secondVertex+'": '
            h=eval(input(s))
            self.addVertex(secondVertex,h)
        self.vertices[firstVertex].addNeighbour(secondVertex,weight)
        
    def allVertexObjects(self):
            return list(self.vertices.values())
        
class Problem:
    def __init__(self,stateSpace ,iState,gStates):
        self.stateSpace = stateSpace
        self.initialState= iState
        self.goalStates=gStates
        
    def goalTest(self,nodeState):
        if(self.goalStates==None):
            return False
        if(nodeState in self.goalStates):
            return True
class Node:
    def __init__(self,currentState,parentNode,pathCost):
        self.state=currentState
        self.parent=parentNode
        self.pathCost=pathCost
        
class Queue:
    def __init__(self):
        self.q=[]
        
    def enqueue(self,node):
        self.q.append(node)
        
    def dequeue(self):
        return self.q.pop(0)
    
    def isEmpty(self):
        return (self.q==[])
    
class Stack:
    def __init__(self):
        self.stack=[]
    
    def push(self,node):
        self.stack.append(node)
        
    def pop(self):
        return self.stack.pop()
    
    def isEmpty(self):
        return (self.stack==[])
    
class priorityQueue:
    def __init__(self):
        self.pQ=[]
    
    def enqueue(self,node,priority):
        self.pQ.append((node,priority))
        
    def dequeue(self):
        self.pQ.sort(key=itemgetter(1))
        return self.pQ.pop(0)
    
    def isEmpty(self):
        return (self.pQ==[])
    
class uninformedSearch():
    def printGraph(self,problem):
        print('The State Space Graph is:')
        print('----------------------------------')
        for vertexObject in problem.stateSpace.allVertexObjects():
            print( '(',vertexObject.state,',',vertexObject.heuristicValue,') -> ',end='')
            print(vertexObject.successors())
        print('------------------------------------')
        
    def createChildNode(self,childState,parentNode,stepCost):
        n=Node( currentState=childState,parentNode=parentNode,pathCost=(parentNode.pathCost+stepCost) )
        return n
    
    def solution(self,problem,goalNode):
        self.currentNode=goalNode
        self.solutionPath=[]
        self.solutionPath.append(self.currentNode)
        while(self.currentNode.state != problem.initialState):
            for exploredNode in self.exploredSet:
                if (self.currentNode.parent.state==exploredNode.state):
                    self.currentNode=exploredNode
                    self.solutionPath.append(self.currentNode)
                    break
        self.solutionPath.reverse()
        print('\nGoal Found!!!')
        print('The path to the solution is: ',end='')
        for solution in self.solutionPath:
            print('(',solution.state,',',solution.pathCost,')',end=' -> ')
        print(end='\n')
        
    def BFS(self,problem):
        self.node=Node(currentState=problem.initialState,parentNode=Node(None,None,None),pathCost=0)
        if(problem.goalTest(self.node.state)):
            return self.solution(problem,self.node)
        
        self.frontier=Queue()
        self.frontier.enqueue(self.node)
        self.frontierStates=[]
        self.frontierStates.append(self.node.state)
        
        self.exploredSet=[]
        self.exploredSetStates=[]
        
        self.count=0
        
        while(True):
            #Following five statements are for printiong purpose only
            self.frontierStates=[x.state for x in self.frontier.q]
            print('step',self.count,': ',end='')
            print('Frontier: ',self.frontierStates,end='\n')
            print('\t Explored:',self.exploredSetStates)
            self.count+=1
            
            #Code states from here
            if(self.frontier.isEmpty()):
                print("Failure, No solution to the goal found.")
                break
            self.node=self.frontier.dequeue()
            self.frontierStates=[x.state for x in self.frontier.q]
            self.exploredSet.append(self.node)
            self.exploredSetStates=[x.state for x in self.exploredSet]
            for childState,weight in problem.stateSpace.vertices[self.node.state].successors():
                self.child=self.createChildNode(childState,self.node,weight)
                if (self.child.state not in self.frontierStates):
                    if(self.child.state not in self.exploredSetStates):
                        if(problem.goalTest(self.child.state)):
                            #Before returning the solution , print current frontier and exploredSet
                            print('Step' ,self.count,': ',end='')
                            print('Frontier: ',self.frontierStates,end='\n')
                            print('\t Explored:',self.exploredSetStates)
                            return self.solution(problem,self.child)
                        self.frontier.enqueue(self.child)
                        

def createStateSpaceGraph():
    g=Graph()
    v={'S':5,'A':7,'B':3,'C':4,'D':6,'E':5,'F':6,'G1':0,'G2':0,'G3':0}
    
    for vertex,heuristic in v.items():
        g.addVertex(vertex,heuristic)
        
    g.addEdge('S','A',5)
    g.addEdge('S','B',9)
    g.addEdge('S','D',6)
    g.addEdge('A','B',3)
    g.addEdge('A','G1',9)
    g.addEdge('B','A',2)
    g.addEdge('B','C',1)
    g.addEdge('C','S',6)
    g.addEdge('C','G2',5)
    g.addEdge('C','F',7)
    g.addEdge('D','S',1)
    g.addEdge('D','C',2)
    g.addEdge('D','E',2)
    g.addEdge('E','G3',7)
    g.addEdge('F','D',2)
    g.addEdge('F','G3',8)
    
    return g


if __name__ =='__main__':
    g=createStateSpaceGraph()
    problem=Problem(stateSpace=g,iState=g.vertices['S'].state,gStates=[g.vertices['G1'].state,g.vertices['G2'].state,g.vertices['G3'].state])
    
    uSearch=uninformedSearch()
    
    #print the graph First
    print()
    uSearch.printGraph(problem)
    
    #Result of BFS
    print('\nBreadth First Search',end='\n---------------------------\n')
    problem1=Problem(stateSpace=g,iState=g.vertices['S'].state,gStates=g.vertices['G3'].state)
    uSearch.BFS(problem1)
