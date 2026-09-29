class Solution:
    def nextGreaterElement(self, nums1, nums2):
        result = []

        for num in nums1:
            greater = -1

            for i in range(len(nums2)):
                if nums2[i] == num:
                    for j in range(i + 1, len(nums2)):
                        if nums2[j] > num:
                            greater = nums2[j]
                            break
                    break

            result.append(greater)

        return result