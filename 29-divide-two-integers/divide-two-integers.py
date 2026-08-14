class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        
        # Check whether the answer should be positive or negative
        negative = (dividend < 0) != (divisor < 0)

        # Work with positive numbers
        dividend = abs(dividend)
        divisor = abs(divisor)

        answer = 0

        while dividend >= divisor:

            # Start with one divisor
            value = divisor
            count = 1

            # Keep doubling
            while value + value <= dividend:
                value = value + value
                count = count + count

            # Remove the largest possible chunk
            dividend = dividend - value

            # Add how many divisors we removed
            answer = answer + count

        # Apply the sign
        if negative:
            answer = -answer

        # Handle 32-bit integer range
        if answer < -2**31:
            return -2**31

        if answer > 2**31 - 1:
            return 2**31 - 1

        return answer