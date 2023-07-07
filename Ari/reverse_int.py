"""
Reverse Integer

Given a signed 32-bit integer x, return the reverse of x. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assumption:

    Assume the input is a 32-bit signed integer.

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

Example 4:

Input: x = 0
Output: 0

Constraints:

    -2^31 <= x <= 2^31 - 1
    
"""

class Solution:
    def __init__(self):
        self.rev = 0
        self.isneg = False
        
    def reverse(self,integer):
        if(integer<0):
            self.isneg = True
            integer = -integer
        while(integer!=0):
            self.rev = self.rev*10 + integer%10
            integer = integer//10
        if self.isneg:
            return -self.rev
        return self.rev
    
Solution().reverse(123)
Solution().reverse(-123)
Solution().reverse(-130)
