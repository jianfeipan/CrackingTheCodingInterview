/*You  have  two  very  large  binary  trees: T1,with  millions  of  nodes,  and T2,  with  hun-dreds of nodes   Create an algorithm to decide if T2 is a subtree of T1*/
public class SubTree{
    //t1 is much bigger than t2
    public static boolean isSubTree(TreeNode t1, TreeNode t2){
        if(t1==null||t2==null)
            return false;
        if(t1=t2)
            return 
        else
            return isSubTree(t1.left,t2)||isSubTree(t1.right,t2);
    }
    
    public static boolean isSame(TreeNode p, TreeNode q){
        if(p!=q) return false;
        return isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
}
