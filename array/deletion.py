a=[]
n=int(input("Number of elements in array:"))
for i in range(0,n):
   l=int(input(""))
   a.append(l)
print(a)
size=len(a)
#deletion
pos=int(input("enter position at which u want to delete"))
for i in range(pos-1,size-1,1):
    a[i]=a[i+1]
a.pop(size-1)
print(a)
