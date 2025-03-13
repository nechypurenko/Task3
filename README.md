# Task3
The function `countDuplicates` works as follows:

1. It initializes a `countMap` to store the count of each string in the input list.
2. It then iterates through the list of strings. For each string, it updates the count in the `countMap`
3. After counting, the function loops through the entries in `countMap` to identify strings with counts greater than 1 (duplicates) and adds them to the `duplicates` map.
4. The `duplicates` map is then returned as the result.

##Simplicity:

The logic is straightforward:

1.First, count occurrences of each string.
2.Then, filter out the entries that occur more than once.

##Readability:

The separation of counting and filtering steps makes the code easy to read and understand.

##Time Complexity:

Both loops iterate over the list or map once, resulting in an overall time complexity of O(n).
Lookup and insert operations in a HashMap are O(1) on average.

