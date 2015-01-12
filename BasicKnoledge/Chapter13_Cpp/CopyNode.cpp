/*
Write a method that takes a pointer to a Node structure as a parameter and returns a complete copy of the passed-in data structure. The Node structure contains two pointers to other Node structures.
*/
/*
The algorithm will maintain a mapping from a node address in the original structure to the corresponding node in the new structure. This mapping will allow us to discover previously copied nodes during a traditional depth first traversal of the structure. (Traversals often mark visited nodes--the mark can take many forms and does not necessarily need to be stored in the node.) Thus, we have a simple recursive algorithm:
*/
typedef map<Node*,Node*> NodeMap;

Node *copy_recursive(Node *cur, NodeMap &nodeMap){
  if(cur==NULL)
    return NULL;
  NodeMap::iterator i =nodeMap.find(cur);
  if(i!=nodeMap.end())
    return i->second;// we’ve been here before, return the copy
  Node *node=new Node;
  nodeMap[cur]=node;
  node->ptr1=copy_recursive(cur->ptr1,nodeMap);
  node->pt2r=copy_recursive(cur->ptr2,nodeMap);
  return node;
}

Node *copy_structure(Node *node){
  NodeMap nodeMap;
  return copy_recursive(node,nodeMap);
}
