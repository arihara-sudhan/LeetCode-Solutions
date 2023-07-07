"""
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

    2 <= nums.length <= 10^3
    -10^9 <= nums[i] <= 10^9
    -10^9 <= target <= 10^9
    Only one valid answer exists.

"""

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
