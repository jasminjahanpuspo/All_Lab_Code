
class firstclass:
    a=10
    def one(self,x):
        a=x
        return a
        
ob=firstclass()
p=ob.one(100)
print(p)



class person:
    def __init__(self,x):
        self.x=x
        
ob=person(100)

print(ob.x) 
#creating class
class person:
    def __init__(self,fname,lname,id):
        self.fname=fname
        self.lname=lname
        self.id=id
        
ob=person('puspo','saadat','34')
print(ob.fname)  

#constructor
class ami:
    def __init__(self,fname=None,lname=None,id=0):
        self.fname=fname
        self.lname=lname
        self.id=id
        
    def now(self):
        print(self.fname)
ob=ami()
ob.now()
ob2=ami('puspo')  
ob2.now()      
        
class person:#creating class first
    def __init__(self,fname,lname,id):#constructor
        self.firstName=fname#initializing variable
        self.lastName=lname
        self.id=id
ob=person('jasmin','jahan','34')#passing parameters in class 
print(ob.firstName)#clling an variable it will work cz it connected


class ami:
    def __init__(self,lname):
        self.lastName=lname
ob=ami('puspo')
print(ob.lastName)  

############inheritance####
class thirdClass():
    a=10
    def __init__(self,x=15):
        self.b=x
    def thirdMethod(self):
        self.c=15
        print(self.a,self.b)
        
##now inherit## 
class fourthClass(thirdClass):
    def __init__(self,y=34):
        super().__init__()
        self.d=10
    def fourthMethod(self):
        print(self.a,self.b,self.d)
        
        
    
        
        
ob2=fourthClass()
ob2.fourthMethod()        
#ob=thirdClass()
ob.thirdMethod()


        
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    
