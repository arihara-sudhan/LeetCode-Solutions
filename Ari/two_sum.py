#BRUTE FORCE APPROACH
def twosum(a,tgt):
    for i in range(len(a)):
        for j in range(len(a)):
            if a[i]+a[j]==tgt:
                return [i,j]
    return []


#TWO POINTER APPROACH
def twoptrsum(a,tgt):
    i,j = 0,len(a)-1
    while(i<j):
        sum = a[i]+a[j]
        if(sum<tgt):
            i+=1
        elif(sum>tgt):
            j-=1
        else:
            return [i,j]
    return []


#CHECK OUT
print(twosum([1,2,3,4,5],5))
print(twoptrsum([1,2,3,4,5],5))
