#
#def recur_fibo(n):
#   """Recursive function to
#   print Fibonacci sequence"""
#   if n <= 1:
#       return n
#   else:
#       return(recur_fibo(n-1) + recur_fibo(n-2))
#
## Change this value for a different result
#nterms = 10
#
## uncomment to take input from the user
##nterms = int(input("How many terms? "))
#
## check if the number of terms is valid
#if nterms <= 0:
#   print("Plese enter a positive integer")
#else:
#   print("Fibonacci sequence:")
#   for i in range(nterms):
#       print(recur_fibo(i))
#       
       
       
#n = int(input("Input a number: "))       
num = 12

# To take input from the user
# num = int(input("Display multiplication table of? "))

# use for loop to iterate 10 times
for i in range(1, 11):
   print(num,'x',i,'=',num*i)

def fibo(n):
    if(n<=1):
        return n
    else:
        return (fibo(n-1)+fibo(n-2))
    
    
   
n=eval(input())
for x in range(n):
    print(fibo(x))    
    