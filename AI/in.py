#
#############inheritance####
#class thirdClass():
#    a=10
#    def __init__(self,x=15):
#        self.b=x
#    def thirdMethod(self):
#        self.c=15
#        print(self.a,self.b)
#        
###now inherit## 
#class fourthClass(thirdClass):
#    def __init__(self,y=34):
#        super().__init__()
#        self.d=10
#    def fourthMethod(self):
#        print(self.a,self.b,self.d)
#        
#        
#    
#        
#        
#ob2=fourthClass()
#ob2.fourthMethod()        
##ob=thirdClass()
#ob.thirdMethod()


#
#class ThirdClass:
#    a=10
#    def __init__(self,x=15):
#        self.b=15
#    def now(self,a):
#        self.f=5
#        print(self.a,self.b)
#        
#class FourthClass(ThirdClass):
#    def __init__(self,y=10):
#        super().__init__()
#        self.d=65
#        
#    def then(self):
#        print(self.a,self.b,self.d)
#
#ob=FourthClass()
#ob.then()  
#ob.now(98)  
##constructor
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
        
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
