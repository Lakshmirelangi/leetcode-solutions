class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        n1, n2 = len(nums1), len(nums2)
        total_len = n1 + n2
        median_idx = total_len // 2
        i = j = count = 0
        prev = curr = 0
        while count<=median_idx:
            prev=curr
            if i<n1 and (j>=n2 or nums1[i]<nums2[j]):
                curr=nums1[i]
                i+=1
            else:
                curr=nums2[j]
                j+=1
            count+=1
        if total_len%2==1:
            return float(curr)
        else:
            return(prev+curr)/2.0