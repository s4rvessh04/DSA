import unittest
from Recursion import sum_n


class TestRecursion(unittest.TestCase):
    def test_sum_n(self):
        self.assertEqual(sum_n(1), 1)
        self.assertEqual(sum_n(2), 3)
        self.assertEqual(sum_n(5), 15)
        self.assertEqual(sum_n(10), 55)


if __name__ == "__main__":
    unittest.main()
