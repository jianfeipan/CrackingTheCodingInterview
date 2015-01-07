/*Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth (eg, if you have a tree with depth D, you’ll have D linked lists).*/
public class FindNodesByLevel{
    public static ArrayList<LinkedList<TreeNode>> findLevelLinkedList(TreeNode root){
        ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> list=new LinkedList<TreeNode>();
        list.add(root);
        int level=0;
        result.add(level, list);
        while(true){
            list=new LinkedList<TreeNode>();
            for(int i=0;i<result.get(level).size();i++){
                TreeNode n=result.get(level).get(i);
                if(n!=null){
                    if(n.left!=null) list.add(n.left);
                    if(n.right!=null) list.add(n.right);
                }
            }
            if(list.size==0){
                break;
            }else{
                result.add(level+1,list)
            }
            level++;
        }
    } 
}
