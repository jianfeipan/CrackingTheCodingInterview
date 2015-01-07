public class GrapheFindePath{
    public enum State{
        Unvisited, Visited, Visiting
    }

    public static boolean search(Graph g, Node start, Node end){
        LinkedList<Node> q=new LinkedList<Node>();
        for(Node u : g.getNodes())
            u.state = State.Unvisited;
        start.state=State.Visiting;
        q.add(start);
        Node u;
        while(!q.Empty()){
            u=q.removeFirst()//FIFO BFE(Queue)
            if(u!=null){
                for(Node v:u.getAdjacent()){
                    if(v.state!=visited){
                        if(v==end) return true;
                        else{
                            v.state=State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state=State.Visited
            }
        }
        return false;
    }
}
