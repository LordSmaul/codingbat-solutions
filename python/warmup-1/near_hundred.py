"""
Given an int n, return True if it is within 10 of 100 or 200.

near_hundred(93) → True
near_hundred(90) → True
near_hundred(89) → False
"""


def near_hundred(n):
    return abs(n - 100) <= 10 or abs(n - 200) <= 10
