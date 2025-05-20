def movezero(arr):
    j=0
    for i in range(0,len(arr)):
        if arr[i]!=0:
            arr[i],arr[j]=arr[j],arr[i]
            j+=1
    return arr      
arr=[1,0,3,2,0,0,4,0,9]
print(movezero(arr))
