class Node:
    def __init__(self,data:str):
        self.data = data
        self.left:Node = None
        self.right:Node = None
        self.parent:Node = None

class Tree:
    def __init__(self):
        self.root:Node = None
        self.node_map = {}
    # def insert(self,data:map):
    #     if self.root == None:
    #         self.root = Node(data['T'])
    #         self.node_map['T'] = self.root
    
    def insert(self,map:dict):
        str_key = list(map.keys())[0]
        cur = self.root
        newNode = Node(map[str_key])
        for i in str_key:
            if i == 'L':
                if cur.left == None:
                    cur.left = newNode
                    newNode.parent = cur
                else:
                    cur = cur.left
            if i == 'R':
                if cur.right == None:
                    cur.right = newNode
                    newNode.parent = cur
                else:
                    cur = cur.right

node_map:dict = {'TL':'b','TLR':'e','TLL':'d','TLLR':'h','TR':'c','TRL':'f','TRR':'g'}
tree = Tree()