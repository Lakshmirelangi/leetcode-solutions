class Solution:
    def calPoints(self, ops: list[str]) -> int:
        stack = []
        for op in ops:
            if op=="C":
                stack.pop()
            elif op=="D":
                last = stack[-1]
                stack.append(last*2)
            elif op=="+":
                a = stack[-1]
                b = stack[-2]
                stack.append(a+b)
            else:
                stack.append(int(op))
        return sum(stack)
        