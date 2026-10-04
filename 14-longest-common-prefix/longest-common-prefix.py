class Solution:
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""

        prefix = strs[0]

        for word in strs[1:]:
            i = 0

            while i < min(len(prefix), len(word)):
                if prefix[i] != word[i]:
                    break
                i += 1

            prefix = prefix[:i]

            if prefix == "":
                return ""

        return prefix