#
#import matplotlib.pyplot
#
#x,y=[1,2,3,4,5],[0,0,0,0,0]
#matplotlib.pyplot.plot(x,y)
#
#
s= r"a \n b"
print(s)

s="\u09B8\u09BE\u09A6\u09BE\u09A4"
print(s)

z=set('puspo')
print(z)

z=set('saadat')
print(z)


d2={'3':'sojib'}
d={'1':'puspo','2':'saadat'}
d.update(d2)
print(len(d))
for key,value in d.items():
    print(key,value)


d={'one':'26','two':'06','three':'34'}
for i in sorted(d.items()):
    print(i,end=", ")


d={'1':'tiger','2':'lion','3':'cow'}


def rsum(d):
    sum=0
    for i in d:
        sum=sum +d[i]
    return sum 
  
d={'1':100,'2':200,'3':400}
print("sum=" ,rsum(d))

