class Solution:
    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
        answers = [0]*len(temperatures)
        stack = []
        for i in range(len(temperatures)):
            while stack and temperatures[i]>temperatures[stack[-1]]:
                previous = stack.pop()
                answers[previous] = i-previous
            stack.append(i)
        return answers
