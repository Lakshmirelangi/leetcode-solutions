class Solution:
    def isPalindrome(self, head):

        arr = []
        curr = head

        while curr != None:
            arr.append(curr.val)
            curr = curr.next

        return arr == arr[::-1]
