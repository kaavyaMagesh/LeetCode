from collections import deque  # Import deque for efficient queue operations

class Solution(object):
    def numIslands(self, grid):
        if not grid:
            return 0  # If the grid is empty, there are no islands

        count = 0  # To count the number of islands
        row = len(grid)  # Total number of rows
        col = len(grid[0])  # Total number of columns
        visit = set()  # To keep track of visited cells

        def bfs(r, c):
            # Start a breadth-first search from cell (r, c)
            searchq = deque()
            searchq.append((r, c))  # Enqueue the starting cell
            visit.add((r, c))  # Mark it as visited

            while searchq:
                rows, cols = searchq.popleft()  # Dequeue the front cell

                # Explore the 4 neighboring directions (up, down, left, right)
                directions = [[1, 0], [0, 1], [-1, 0], [0, -1]]
                for dr, dc in directions:
                    nr, nc = rows + dr, cols + dc  # Compute neighbor coordinates

                    # Check if neighbor is within bounds, is land ('1'), and not visited
                    if (0 <= nr < row and 0 <= nc < col and
                        grid[nr][nc] == '1' and (nr, nc) not in visit):
                        searchq.append((nr, nc))  # Enqueue the neighbor
                        visit.add((nr, nc))  # Mark neighbor as visited

        # Loop through each cell in the grid
        for r in range(row):
            for c in range(col):
                # If the cell is land and not yet visited, it's a new island
                if grid[r][c] == '1' and (r, c) not in visit:
                    bfs(r, c)  # Explore the whole island using BFS
                    count += 1  # Increment island count

        return count  # Return total number of islands found
