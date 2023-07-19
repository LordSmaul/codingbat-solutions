"""
Given a non-negative number "num", return True if num is within 2 of a multiple of 10.  

near_ten(12) → True
near_ten(17) → False
near_ten(19) → True
"""


def near_ten(num):
    return num % 10 <= 2 or num % 10 >= 8
