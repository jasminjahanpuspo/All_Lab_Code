
d={'1':'Sakib','2':'tamim','3':'mushfiq'}
for key,value in d.items():
    print(key,value)
    
d2={'4':'mashrafi','5':'riad'}
d.update(d2)
print(d)

print(len(d))


#taking input 4m user & sort them
d={}
n=eval(input())
m=eval(input())
d[n]=m
    
my_dict = dict()
 
key = input("Enter the key: ")
value = input("Enter the value: ")
 
my_dict[key] = value
print(my_dict)


d={'one':'26','two':'06','three':'34'}#sorting
for x in sorted(d.items()):
    print(x)

#
# sum   
def sum(d):
    to=0
    for x in d:
        to=to+d[x]
    return to
d={'1':100,'2':200}
print(sum(d))    
