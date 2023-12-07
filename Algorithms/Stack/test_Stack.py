import unittest
from Stack import Stack


class TestStack(unittest.TestCase):
    def test_push_single_value(self):
        stack = Stack()
        stack.push(10)
        self.assertEqual(stack.length, 1)
        self.assertEqual(stack.peek(), 10)

    def test_push_multiple_values(self):
        stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(30)
        self.assertEqual(stack.length, 3)
        self.assertEqual(stack.peek(), 30)

    def test_pop_empty_stack(self):
        stack = Stack()
        popped_value = stack.pop()
        self.assertIsNone(popped_value)

    def test_pop_single_value(self):
        stack = Stack()
        stack.push(10)
        popped_value = stack.pop()
        self.assertEqual(popped_value, 10)
        self.assertEqual(stack.length, 0)

    def test_pop_multiple_values(self):
        stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(30)
        popped_value = stack.pop()
        self.assertEqual(popped_value, 30)
        self.assertEqual(stack.length, 2)

    def test_peek_empty_stack(self):
        stack = Stack()
        top_value = stack.peek()
        self.assertIsNone(top_value)

    def test_peek_single_value(self):
        stack = Stack()
        stack.push(10)
        top_value = stack.peek()
        self.assertEqual(top_value, 10)

    def test_peek_multiple_values(self):
        stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(30)
        top_value = stack.peek()
        self.assertEqual(top_value, 30)


if __name__ == "__main__":
    unittest.main()
