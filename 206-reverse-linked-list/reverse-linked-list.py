class Solution:
    def reverseList(self, head):
        # Base case
        if head is None or head.next is None:
            return head

        # Reverse the remaining list
        new_head = self.reverseList(head.next)

        # Put current node after the next node
        head.next.next = head

        # Break the old connection
        head.next = None

        return new_head