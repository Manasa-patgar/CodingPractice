"""Graphs algorithms implementations.
"""
from collections import defaultdict, deque
import heapq


def bfs(adj, start):
    """Return list of nodes in BFS order starting from start."""
    visited = set([start])
    order = []
    queue = deque([start])
    while queue:
        node = queue.popleft()
        order.append(node)
        for neigh in adj[node]:
            if neigh not in visited:
                visited.add(neigh)
                queue.append(neigh)
    return order


def dfs(adj, start):
    """Return list of nodes in DFS preorder starting from start."""
    visited = set()
    order = []

    def _dfs(node):
        visited.add(node)
        order.append(node)
        for neigh in adj[node]:
            if neigh not in visited:
                _dfs(neigh)

    _dfs(start)
    return order


def dijkstra(adj, start):
    """Return shortest distances from start to all reachable nodes.

    Graph must be weighted with adj mapping each node to list of (neighbor, weight).
    """
    dist = {start: 0}
    heap = [(0, start)]
    while heap:
        d, node = heapq.heappop(heap)
        if d != dist[node]:
            continue
        for neigh, weight in adj[node]:
            new_d = d + weight
            if neigh not in dist or new_d < dist[neigh]:
                dist[neigh] = new_d
                heapq.heappush(heap, (new_d, neigh))
    return dist
