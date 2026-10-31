class Solution(object):
    def merge(self, intervals):
        intervals.sort(key=lambda x: x[0])    # 1. sort by start
        merged = [intervals[0]]               # 2. first interval goes in

        for start, end in intervals[1:]:      # 3. go through the rest
            last = merged[-1]                 # 4. last interval in result

            if start <= last[1]:              # 5a. overlap
                last[1] = max(last[1], end)   #     extend the end
            else:                             # 5b. no overlap
                merged.append([start, end])   #     add as new

        return merged                         # 6. done