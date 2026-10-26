class Solution:
    def merge(self,intervals):
        intervals.sort()
        merged=[]
        for interval in intervals:
            if not merged:
                merged.append(interval)
            else:
                last=merged[-1]

                if interval[0]<=last[1]:
                    last[1]=max(last[1],interval[1])
                else:
                    merged.append(interval)

        return merged