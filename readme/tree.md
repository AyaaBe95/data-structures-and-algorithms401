# Tree

## Challenges
To use recursion to traverse through the tree's

## contains
-  Binary Tree is used for the three methods used to do traversals,
-  Binary Search Tree can actually insert values into the tree in a proper order.  
 
## API & Big(O) of Binary Tree
| Method           | Description                                                                            | Big-O Time  | Big-O Space  |
|------------------|----------------------------------------------------------------------------------------|-------------|--------------|
| ```inOrder()```  | Returns an ArrayList of the Node values or an in order traversal. (left, root, right)  | O(n)        | O(n)         |
| ```preOrder()``` | Returns an ArrayList of the Node values or a pre-order traversal. (root, left, right)  | O(n)        | O(n)         |
| ```postOrder()```| Returns an ArrayList of the Node values or a post-order traversal. (left, right, root) | O(n)        | O(n)         |


# API & Big(O) of Binary Search Tree

| Method               | Description                                                                                            | Big-O Time  | Big-O Space  |
|----------------------|--------------------------------------------------------------------------------------------------------|-------------|--------------|
| ```add()```         | adds a Node with input value to correct location in tree.                     | O(n)        | O(1)         |
| ```search()```      |  searches the BST for a value. Returns Node if found, or null if not found.    | O(n)        | O(1)         |
