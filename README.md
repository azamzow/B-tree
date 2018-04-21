# B-Tree Search Project

### Description

This project implements a b-tree in both java and python. A b-tree is a self-balancing search tree. It has a parent node called root and child nodes called leaves. 

**Properties of B-Tree**
1) All leaves are at same level.
2) A B-Tree is defined by the term *minimum degree* ‘t’. The value of t depends upon disk block size.
3) Every node except root must contain at least t-1 keys. Root may contain minimum 1 key.
4) All nodes (including root) may contain at most 2t – 1 keys.
5) Number of children of a node is equal to the number of keys in it plus 1.
6) All keys of a node are sorted in increasing order.  The child between two keys k1 and k2 contains all keys in range from k1 and k2.
7) B-Tree grows and shrinks from root which is unlike Binary Search Tree. Binary Search Trees grow downward and also shrink from downward.
8) Like other balanced Binary Search Trees, time complexity to search, insert and delete is O(Logn).

### To Run

You can double click hello termianl already made, or Using terminal on Mac,

```
// To run java B-tree
$ cd B-tree
$ cd SearchB-tree_java
$ javac SearchBtree.java
$ java SearchBtree
```

```
//To run python B-tree
$ cd B-tree
$ cd SearchB-Tree_python
$ python ./b-tree2.py
```

### Output

In SearchB-tree_java file, you have a b-tree that consists of a root, and two levels under it (right level, left level). When the program is ran, it asks the user to enter an key. When the key is entered, the algorithm searchs the tree. It starts from root and recursively traverses down.  For every visited non-leaf node, if the node has the key, the program simply returns the node. Otherwise the algorithm recurs down to the appropriate child. 

​	If the program reaches the end of the tree and doensn't find the key, the program returns 'Doesn't Exist'.

​	If the key is found, the program returns the level it searched and the record it was on in that level. For Ex: If I were looking for 3. That would be on level 2, the first record (assuming we start counting the records at 0) as shown below...

![output](https://github.com/azamzow/B-tree/SearchB-tree_java/blob/master/output.png?raw=true)



In SearchB-tree_Python file, you have a b-tree that you create in the main file using the method names .insert(). Doing this, creates the b-tree. Finally after the b-tree is created, you use the method named .search(). Doing this, searches the b-tree and prints out if the key is in the tree or not. If it isnt in the tree, then your program will print out 'False'. If it is found however, the program will output the entire tree, and when it is done it will print NONE and terminate as shown in below![output](https://github.com/azamzow/B-tree/SearchB-tree_python/blob/master/output.png?raw=true)
