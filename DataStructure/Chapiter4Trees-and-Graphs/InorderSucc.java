/*Write an algorithm to find the ‘next’ node (e.g., in-order successor) of a given node in a binary search tree where each node has a link to its parent.*/
public class InorderSucc{
    public static TreeNode inorderSucc(TreeNode node){
        if(node=null)
            return null;
        if(node.right!=null){//when hthe node has right branch, the seccesor is the most left in his right branch
            TreeNode mostleft=node.right;
            while(mostleft.left!=null)
                mostleft=mostleft.left;
            return mostleft;
        }else{//when the node doesn't have right branch, his seccesor will be on of his parents and it's the first parent when we turn right for going "up" all his parents
            TreeNode p=node.parent;
            TreeNode e=node;
            while (p!= null) {
                if (p.left == e) {
                    break;
                }
                    e = p;
                }
            }
            return p;
        }
    }
}
