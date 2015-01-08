/*Design an algorithm and write code to find the first common ancestor of two nodes 
in a binary  tree   Avoid storing additional nodes in a data structure    NOTE: This is not 
necessarily a binary search tree  */
public class CommenAncestor{
    public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(covers(root.left,p)&&covers(root.left,q))
            return commenAncestor(root.left,p,q);
        if(covers(root.right,p)&&covers(root.right,q))
            return commenAncestor(root.right,p,q);
        return root;
    }
    
    /*
    if root is a ancestor of root
    */
    public static boolean covers(TreeNode root, TreeNode node){
        if(root==null) return false;
        if(root==p) return true;
        return covers(root.left,node)||covers(root.right,node);
    }
}
