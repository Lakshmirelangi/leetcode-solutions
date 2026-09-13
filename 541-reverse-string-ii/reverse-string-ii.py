class Solution:
    def reverseStr(self, s, k):
        s = list(s)

        def reverse_part(left, right):
            if left >= right:
                return

            s[left], s[right] = s[right], s[left]
            reverse_part(left + 1, right - 1)

        def process(start):
            if start >= len(s):
                return

            end = min(start + k - 1, len(s) - 1)

            reverse_part(start, end)

            process(start + 2 * k)

        process(0)

        return ''.join(s)