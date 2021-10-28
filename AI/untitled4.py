#
#n=eval(input())
#
#for x in range(1,11):
#    print(n, '*' ,x,'=',n*x)
# 
#i=0    
#while i<10:
#    print("puspo")
#    i=i+1
#    

x,y=10,12
x=10
y=12
print("hello",sep=' | ') 
print("hello")   


#s=(input("enter a string: "))
#print(s)

#x=10
#y=3
#s=x-y
#print(s)
#
#num=eval(input())
#for x in range(0,num):
#    s=eval(input())
#    if(s==10):
#        break
    

#for x in range(5,0,-1):
#    print(x)
#
#
#n='*'
#for x in (0,5):
#    print(n)



#constructor
#class University:
#    def __init__(self,teacher):
#        self.teacher=teacher
#        
#    def Paid(self):
#         print("month is gone")
#         
#         
#ob=University('saadat')
#print(ob.teacher) 
#ob.Paid() 



class Teacher:
    def __init__(self,name,quality):
        self.name=name
        self.q=quality
        print("no")
    def mango(self,ok):
        self.ok=ok
        print("ok")
        print(self.name)
  


class University(Teacher):
    def __init__(self):
        super().__init__(x,y)
        
    def banana(self):
        print("bad")


ob=University()
ob.banana()
ob.mango('ok')


















































