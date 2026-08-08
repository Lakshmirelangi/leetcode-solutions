class Solution:
    def findMedianSortedArrays(self, nums1, nums2):

        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1

        m = len(nums1)
        n = len(nums2)

        left = 0
        right = m

        while left <= right:

            i = (left + right) // 2
            j = (m + n + 1) // 2 - i

            if i > 0:
                Aleft = nums1[i - 1]
            else:
                Aleft = float("-inf")

            if i < m:
                Aright = nums1[i]
            else:
                Aright = float("inf")

            if j > 0:
                Bleft = nums2[j - 1]
            else:
                Bleft = float("-inf")

            if j < n:
                Bright = nums2[j]
            else:
                Bright = float("inf")

            if Aleft <= Bright and Bleft <= Aright:

                if (m + n) % 2 == 1:
                    return max(Aleft, Bleft)

                left_max = max(Aleft, Bleft)
                right_min = min(Aright, Bright)

                return (left_max + right_min) / 2

            elif Aleft > Bright:
                right = i - 1

            else:
                left = i + 1