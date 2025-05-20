def is_sorted(a):
    for i in range (len(a)):
        if a[i+1]<a[i]:
            return False 
    return True
a=[1,4,2,6,9]
print(is_sorted(a))
