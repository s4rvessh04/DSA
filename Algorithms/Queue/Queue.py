class Node:
    """
    Represents a single node in the queue.
    """

    def __init__(self, value, next=None):
        """
        Initializes a new instance of the Node class.

        Args:
            value: The value to be stored in the node.
            next: The reference to the next node in the queue.
        """
        self.value = value
        self.next = next


class Queue:
    """
    Represents a queue data structure.
    """

    def __init__(self):
        """
        Initializes a new instance of the Queue class.
        """
        self.head = self.tail = None
        self.length = 0

    def enqueue(self, val):
        """
        Adds a new element to the end of the queue.

        Args:
            val: The value to be added to the queue.

        Returns:
            The value that was added to the queue.
        """
        new_node = Node(val)
        self.length += 1

        if self.tail is None:
            self.head = self.tail = new_node
            return new_node.value

        self.tail.next = new_node
        self.tail = new_node

        return new_node.value

    def dequeue(self):
        """
        Removes and returns the element at the front of the queue.

        Returns:
            The value of the element that was removed from the queue.
            Returns None if the queue is empty.
        """
        if self.head is None:
            return None

        dequeued_node = self.head
        self.head = self.head.next
        dequeued_node.next = None

        self.length -= 1

        return dequeued_node.value

    def peek(self):
        """
        Returns the value of the element at the front of the queue without removing it.

        Returns:
            The value of the element at the front of the queue.
            Returns None if the queue is empty.
        """
        if self.head is None:
            return None

        return self.head.value
