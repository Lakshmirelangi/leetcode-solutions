from collections import Counter

class Solution:
    def minWindow(self, s, t):

        if not s or not t:
            return ""

        need = Counter(t)

        window = {}

        left = 0
        required = len(need)
        formed = 0

        min_length = float("inf")
        answer = ""

        for right in range(len(s)):

            char = s[right]

            # Add character to window
            window[char] = window.get(char, 0) + 1

            # Character requirement satisfied
            if char in need and window[char] == need[char]:
                formed += 1

            # Try shrinking
            while formed == required:

                # Update minimum
                if right - left + 1 < min_length:
                    min_length = right - left + 1
                    answer = s[left:right + 1]

                # Remove left character
                left_char = s[left]
                window[left_char] -= 1

                if left_char in need and window[left_char] < need[left_char]:
                    formed -= 1

                left += 1

        return answer