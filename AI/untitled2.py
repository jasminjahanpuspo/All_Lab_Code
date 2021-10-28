

r_name='fulkoli'
r_owner="p"

def resturant():
    print(r_name,r_owner)
    
def another():
    r_add="noyasorok"
    print(r_name,r_owner)
    print(r_add)
    
resturant()
another() 


class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        
    
    
    
    
    def detail(self):    
        print(self.name,self.age,sep=' | ')
        
bill=Person('bill',34)
bill.detail()        
#print(bill.name,bill.age)


class Math:
    def __init__(self,x,y,):
        self.x=x
        self.y=y
        
    def sum(self):
        return self.x+self.y
    
class Eng(Math):
    def __init__(self,x,y):
        super().__init__(x,y)
        
    def sub(self):
        return (self.x-self.y)
    
    
    
p=Eng(4,2)
p.sum()    
print(p)
































       
        
        