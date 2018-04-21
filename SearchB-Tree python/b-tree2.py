class b_tree2:
    def __init__(self):
        self.root = None
        self.size = 0
        
    # Returns the entire record if the element is in the tree
    def search(self, e):
        current = self.root # Start from the root
            
        while current != None:
            if e < current.element:
                current = current.left
            elif e > current.element:
                current = current.right
            else: # element matches current.element
                return B.postorder(); # Element is found
                
        return False;
        
    # Insert element e into the binary search tree
    # Return True if the element is inserted successfully
    def insert(self, e):
        if self.root == None:
            self.root = self.createNewNode(e) # Create a new root
        else:
            # Locate the parent node
            parent = None
            current = self.root
            while current != None:
                if e < current.element:
                    parent = current
                    current = current.left
                elif e > current.element:
                    parent = current
                    current = current.right
                else:
                    return False # Duplicate node not inserted
                
            # Create the new node and attach it to the parent node
            if e < parent.element:
                parent.left = self.createNewNode(e)
            else:
                parent.right = self.createNewNode(e)
                
        self.size += 1 # Increase tree size
        return True # Element inserted
    
    # Create a new TreeNode for element e
    def createNewNode(self, e):
        return TreeNode(e)

    # Postorder traversal from the root
    def postorder(self):
        self.postorderHelper(self.root)
        
    # Postorder traversal from a subtree
    def postorderHelper(self, root):
        if root != None:
            self.postorderHelper(root.left)
            self.postorderHelper(root.right)
            print(root.element, end = " ")
    
class TreeNode:
    def __init__(self, e):
        self.element = e
        self.left = None # Point to the left node, default None
        self.right = None # Point to the right node, default None
        
        
B = b_tree2()
        
B.insert(14)
B.insert(5)
B.insert(9)
B.insert(24)
B.insert(35)
B.insert(1)
B.insert(3)
B.insert(4)
B.insert(7)
B.insert(8)
B.insert(11)
B.insert(13)
B.insert(19)
B.insert(23)
B.insert(25)
B.insert(31)
B.insert(45)
B.insert(56)
print (B.search(31));
