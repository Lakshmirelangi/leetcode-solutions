'''class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        max_length = 0
        n = len(s)

        for i in range(n):

            for j in range(i, n):

                substring = s[i:j+1]

                if len(substring) == len(set(substring)):
                    max_length = max(max_length, len(substring))//time complexity:

        return max_length'''
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        char_set = set()

        left = 0
        max_length = 0

        for right in range(len(s)):

            while s[right] in char_set:
                char_set.remove(s[left])
                left += 1

            char_set.add(s[right])

            max_length = max(max_length, right - left + 1)

        return max_length