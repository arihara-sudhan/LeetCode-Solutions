"""
Palindrome Number

Determine whether an integer x is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Assumption:

    You are not allowed to convert the integer to a string.

Example 1:

Input: x = 121
Output: true

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.

Example 4:

Input: x = -101
Output: false

Constraints:

    -2^31 <= x <= 2^31 - 1
"""

class Solution:
    def __init__(self):
        self.rev = 0
        self.isneg = False
        
    def ispalind(self,integer):
        if(integer<0 or integer%10==0):
            return False
        temp = integer
        while(integer!=0):
            self.rev = self.rev*10 + integer%10
            integer = integer//10
        if self.rev==temp:
            return True
        return False
    
Solution().ispalind(123)
Solution().ispalind(121)
Solution().ispalind(-121)
Solution().ispalind(120)
