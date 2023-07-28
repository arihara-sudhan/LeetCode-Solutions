"""
3Sum

Given an array `nums` of n integers, find all unique triplets in the array that sum up to the target sum `0`. 
You may return the triplets in any order. The solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []

Constraints:
- 0 <= nums.length <= 3000
- -10^5 <= nums[i] <= 10^5

"""
class Solution(object):
    def threeSum(self, nums):
        triplets = set()
        nums.sort()
        for i in range(len(nums)-2):
            first = nums[i]
            second = i+1
            third = len(nums)-1
            while(second<third):
                trip_sum = first + nums[second] + nums[third]
                if trip_sum < 0:
                    second += 1
                elif trip_sum > 0:
                    third -= 1
                else:
                    triplets.add((first, nums[second], nums[third]))
                    second += 1
                    third -= 1
        return triplets
