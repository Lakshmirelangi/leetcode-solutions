class Solution:
    def checkInclusion(self, s1, s2):
        if len(s1) > len(s2):
            return False

        count1 = [0] * 26
        count2 = [0] * 26

        # Frequency of s1
        for char in s1:
            count1[ord(char) - ord('a')] += 1

        window_size = len(s1)

        # Initial window
        for char in s2[:window_size]:
            count2[ord(char) - ord('a')] += 1

        if count1 == count2:
            return True

        # Slide the window
        for right in range(window_size, len(s2)):
            # Add new character
            count2[ord(s2[right]) - ord('a')] += 1

            # Remove old character
            left = right - window_size
            count2[ord(s2[left]) - ord('a')] -= 1

            if count1 == count2:
                return True

        return False