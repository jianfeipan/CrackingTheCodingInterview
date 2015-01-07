public class Balancetree{
    public static int maxDepth(Node root){
        if(root==null){reture 0;}
        return 1+Math.max(maxDepth(root.left), maxDepth(root.left));
    }
    
    public static int minDepth(Node root){
        if(root== null) return 0;
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
    
    public static boolean isBalanced(Node treeroot){
        return (maxDepth(root)-minDepth(root))<=1
    }
}
