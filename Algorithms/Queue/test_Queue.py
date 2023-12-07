import unittest
from Queue import Queue


class TestQueue(unittest.TestCase):
    def test_enqueue_single_value(self):
        queue = Queue()
        queue.enqueue(10)
        self.assertEqual(queue.length, 1)
        self.assertEqual(queue.peek(), 10)

    def test_enqueue_multiple_values(self):
        queue = Queue()
        queue.enqueue(10)
        queue.enqueue(20)
        queue.enqueue(30)
        self.assertEqual(queue.length, 3)
        self.assertEqual(queue.peek(), 10)

    def test_dequeue_empty_queue(self):
        queue = Queue()
        dequeued_value = queue.dequeue()
        self.assertIsNone(dequeued_value)

    def test_dequeue_single_value(self):
        queue = Queue()
        queue.enqueue(10)
        dequeued_value = queue.dequeue()
        self.assertEqual(dequeued_value, 10)
        self.assertEqual(queue.length, 0)

    def test_dequeue_multiple_values(self):
        queue = Queue()
        queue.enqueue(10)
        queue.enqueue(20)
        queue.enqueue(30)
        dequeued_value = queue.dequeue()
        self.assertEqual(dequeued_value, 10)
        self.assertEqual(queue.length, 2)

    def test_peek_empty_queue(self):
        queue = Queue()
        front_value = queue.peek()
        self.assertIsNone(front_value)

    def test_peek_single_value(self):
        queue = Queue()
        queue.enqueue(10)
        front_value = queue.peek()
        self.assertEqual(front_value, 10)

    def test_peek_multiple_values(self):
        queue = Queue()
        queue.enqueue(10)
        queue.enqueue(20)
        queue.enqueue(30)
        front_value = queue.peek()
        self.assertEqual(front_value, 10)


if __name__ == "__main__":
    unittest.main()
