class Solution:
    def eraseOverlapIntervals(self, intervals: list[list[int]]) -> int:
        intervals.sort(key=lambda x:x[1])
        prev_end=intervals[0][1]
        removed=0
        for start,end in intervals[1:]:
            if start<prev_end:
                removed+=1
            else:
                prev_end=end
        return removed