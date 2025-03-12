# Task3
The function `countDuplicates` works as follows:

1. It initializes a `countMap` to store the count of each string in the input list.
2. It then iterates through the list of strings. For each string, it updates the count in the `countMap`
3. After counting, the function loops through the entries in `countMap` to identify strings with counts greater than 1 (duplicates) and adds them to the `duplicates` map.
4. The `duplicates` map is then returned as the result.

### Time Complexity:
- **O(n)**: The time complexity of the solution is linear, as it requires two separate loops: one for counting and another for filtering duplicates. Both loops are O(n), where n is the size of the input list.

### Space Complexity:
- **O(n)**: The space complexity is O(n) because we store the string counts in a map. In the worst case, if all strings are unique, the map will hold n entries.

