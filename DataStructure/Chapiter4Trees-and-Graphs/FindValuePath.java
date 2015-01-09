/*You are given a binary tree in which each node contains a value    Design an algorithm 
to print all paths which  sum up to that value    Note that it can be any path in the tree 
- it does not have to start at the root  */
public class FindValuePath{
  public static void printSumPath(TreeNode root, int sum, ArrayList<Integer> buffer, int level){
    if(root==null) return;
    int tmp=sum;
    buffer.add(root.data);
    for(int i=level;i>-1;i--){
      tmp-=buffer.get(i);
      if(tmp==0) print(buffer,i,level);
    }
    ArrayList<Interger> c1=(ArrayList<Interger>)buffer.clone();
    ArrayList<Interger> c2=(ArrayList<Interger>)buffer.clone();
    findSum(head.left,sum,level+1);
    findSum(head.right,sum,level+1);
  }
  
  public static void print(ArrayList<Integer> buffer, int i, int level){
    for(int j=level;j<=i;i++){
      System.out.print(buffer.get(i)+" ");
    }
    System.out.println();
  }
}
