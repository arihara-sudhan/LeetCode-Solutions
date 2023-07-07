"""
Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([)]"
Output: false

Example 5:

Input: s = "{[]}"
Output: true

Constraints:

    1 <= s.length <= 10^4
    s consists of parentheses only: '(', ')', '{', '}', '[' and ']'.
"""



class Solution:
    def __init__(self):
        self.stack = []
        self.guyz = {'{':'}','(':')','[':']'}
    
    def get_pair(self,v):
        for i in self.guyz:
            if self.guyz[i]==v:
                return i
            
    def isvalid(self,exp):
        for c in exp:
            if c in self.guyz.values():
                if self.stack==[]:
                    return False
                if self.stack[len(self.stack)-1]==self.get_pair(c):
                    self.stack.pop()
                else:
                    return False
                
            elif c in self.guyz.keys():
                self.stack.append(c)
        if self.stack==[]:
            return True
        return False
    
Solution().isvalid("[]{()}({}{})")
Solution().isvalid("[]{()}({}{}(){}})")
