def duplicate(a):
    i=0
    while i<len(a)-1:
        if(a[i]==a[i+1]):
            a.pop(i)
        else:
            i+=1
    return a
a=[1,1,2,2,3,3,5,7]
print(duplicate(a))
