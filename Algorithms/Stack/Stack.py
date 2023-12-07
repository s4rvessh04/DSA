class Node:
    def __init__(self, value, prev=None):
        """
        Initialize a new Node object.

        Args:
            value: The value of the node.
            prev: The previous node in the stack. Default is None.

        Returns:
            None
        """
        self.value = value
        self.prev = prev


class Stack:
    def __init__(self):
        """
        Initialize a new Stack object.

        Args:
            None

        Returns:
            None
        """
        self.head = None
        self.length = 0

    def push(self, val):
        """
        Pushes a new element onto the stack.

        Args:
            val: The value to be pushed onto the stack.

        Returns:
            None
        """
        new_node = Node(val)
        self.length += 1

        if self.head is None:
            self.head = new_node
            return

        new_node.prev = self.head
        self.head = new_node

    def pop(self):
        """
        Removes and returns the top element from the stack.

        Args:
            None

        Returns:
            The value of the top element, or None if the stack is empty.
        """
        popped_node = self.head

        if popped_node is None:
            return None

        self.head = popped_node.prev
        popped_node.prev = None
        self.length -= 1

        return popped_node.value

    def peek(self):
        """
        Returns the value of the top element in the stack without removing it.

        Args:
            None

        Returns:
            The value of the top element, or None if the stack is empty.
        """
        if self.head is None:
            return None

        return self.head.value
