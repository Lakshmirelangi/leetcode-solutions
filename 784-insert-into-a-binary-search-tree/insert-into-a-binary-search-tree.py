# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: TreeNode | None, val: int) -> TreeNode | None:
        if not root:
            return TreeNode(val)
        curr=None
        next=root
        while next:
            curr=next
            next = curr.left if val<curr.val else curr.right
        if val < curr.val:
            curr.left=TreeNode(val)
        else:
            curr.right=TreeNode(val)
        return root