class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:

        # Step 1: Store rows and columns that contain a zero
        zero_rows = set()
        zero_cols = set()

        rows = len(matrix)
        cols = len(matrix[0])

        # First Traversal
        # Find all zeros and remember their row and column
        for r in range(rows):
            for c in range(cols):
                if matrix[r][c] == 0:
                    zero_rows.add(r)
                    zero_cols.add(c)

        # Second Traversal
        # If current row or column is marked,
        # make that cell zero
        for r in range(rows):
            for c in range(cols):
                if r in zero_rows or c in zero_cols:
                    matrix[r][c] = 0