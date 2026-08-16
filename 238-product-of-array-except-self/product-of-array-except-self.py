'''class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)

        prefix = [1] * n
        suffix = [1] * n
        answer = [1] * n

        # Build prefix array
        product = 1

        for i in range(n):
            prefix[i] = product
            product = product * nums[i]

        # Build suffix array
        product = 1

        for i in range(n - 1, -1, -1):
            suffix[i] = product
            product = product * nums[i]

        # Build answer
        for i in range(n):
            answer[i] = prefix[i] * suffix[i]

        return answer'''
class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)

        answer = [1] * n

        # Prefix products
        product = 1

        for i in range(n):
            answer[i] = product
            product = product * nums[i]

        # Suffix products
        right_product = 1

        for i in range(n - 1, -1, -1):
            answer[i] = answer[i] * right_product
            right_product = right_product * nums[i]

        return answer