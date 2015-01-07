/*Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.*/
public class ArrayToMinBST{
  public static TreeNode addTreeNode(int[] array,int start, int end){
    int mid=(start+end)/2;
    TreeNode node = new TreeNode(array[mid]);
    node.left=addTreeNode(array,start,mid-1);
    node.right=addTreeNode(array,mid+1,end);
    return node;
  }
  
  public static TreeNode createMinimalBST(int[] array){
    return addTreeNode(array, 0, array.lenght-1);
  }
}
