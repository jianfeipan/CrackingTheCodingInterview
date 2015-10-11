/*You are given a binary tree in which each node contains a value    Design an algorithm 
to print all paths which  sum up to that value    Note that it can be any path in the tree 
- it does not have to start at the root  */
public class FindValuePath{
  public static void printSumPath(TreeNode root, int sum, int level){
    if(root==null) return;
    int tmp=sum;
    buffer.add(root.data);
    for(int i=level;i>-1;i--){
      tmp-=buffer.get(i);
      if(tmp==0) print(buffer,i,level);
    }
    printSumPath(head.left,sum,level+1);
    printSumPath(head.right,sum,level+1);
  }
  
  public static void print(ArrayList<Integer> buffer, int i, int level){
    for(int j=level;j<=i;i++){
      System.out.print(buffer.get(i)+" ");
    }
    System.out.println();
  }
}
