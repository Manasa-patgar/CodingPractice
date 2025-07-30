"""Binary tree algorithms implementations."""
from collections import deque


class TreeNode:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def max_depth(root):
    """Return maximum depth (height) of binary tree."""
    if not root:
        return 0
    return 1 + max(max_depth(root.left), max_depth(root.right))


def inorder_traversal(root):
    """Return nodes' values in inorder."""
    result = []

    def _inorder(node):
        if not node:
            return
        _inorder(node.left)
        result.append(node.val)
        _inorder(node.right)

    _inorder(root)
    return result


def level_order(root):
    """Return list of levels using BFS."""
    if not root:
        return []
    result = []
    queue = deque([root])
    while queue:
        level_size = len(queue)
        level = []
        for _ in range(level_size):
            node = queue.popleft()
            level.append(node.val)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        result.append(level)
    return result
