a=[]
n=int(input("Number of elements in array:"))
for i in range(0,n):
   l=int(input())
   a.append(l)
print(a)
size=len(a)
#deletion
pos=int(input("enter position at which u want to delete"))
for i in range(size-1,pos-1,-1):
    a[i+1]=a[i]
a[pos-1]=ele
print(a)
