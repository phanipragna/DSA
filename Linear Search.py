def lsearch(arr):
    for i in range (0,len(arr)):
        if(arr[i]==x):
            return i
    return -1
arr=[1,3,8,9,2,0,7]
x=int(input("Enter element to search : "))
print("element found at position ",(lsearch(arr)+1))
