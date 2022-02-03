package chegg;

import java.util.*;

public class GraphTraversal {

	public static void main(String[] args) {
		 DiGraph g = new DiGraph(10);
         
//	        g.addEdge(1, 0);
//	        g.addEdge(0, 2);
//	        g.addEdge(2, 1);
//	        g.addEdge(0, 3);
//	        g.addEdge(1, 4);
//	        g.addEdge(4, 5);
//	        g.addEdge(4, 6);
//	        g.addEdge(4, 7);
//	        g.addEdge(6, 7);
//	        g.addEdge(6, 8);
//	        g.addEdge(8, 9);
//	        g.addEdge(9, 9);
//	        g.printGraph();
	        
	        System.out.println("Depth first search visit order: ");
	        g.DFS(0);
	        System.out.println();
	}

}

class DiGraph{
	int V; //Number of Vertices
    
    LinkedList<Integer>[] adj; // adjacency lists
     
    //Constructor
    DiGraph(int V)
    {
        this.V = V;
        adj = new LinkedList[V];
         
        for (int i=0; i<adj.length; i++)
            adj[i] = new LinkedList<Integer>();
         
    }
    
  //To add an edge to graph
//    void addEdge(int v, int w)
//    {
//        adj[v].add(w); // Add w to v’s list.
//    }
//    
    //method for depth first search.
    void DFS(int s) {
    	
    	//linked list to mark all vertices as not visited initially.
    	LinkedList<Boolean> isVisited = new LinkedList<>();
    	
    	//Initially marking all vertices as not visited.
//    	for(int i=0 ; i<V ; i++) {
//    		isVisited.add(false);
//    	}
    	
    	// we konw dfs works on stack , so creating stack for it.
    	Stack<Integer> st = new Stack<>();
    	
    	//adding current node to stack to process
    	st.push(s);
    	
    	//while stack is not empty
    	while(!st.isEmpty()) {
    		
    		//store top vertex to print.
    		s = st.peek();
    		//then pop vertex element.
    		st.pop();
    		
    		
    		//if vertex is not visited print it , then marked it as printed.
//    		if(isVisited.get(s) == false) {
//    			System.out.print(s + " ");
//    			isVisited.set(s, true);
//    		}
//    		
//    		//Iterator to get all adjacent vertices of s
//    		Iterator<Integer> it = adj[s].iterator();
            
    		//if adjacent vertices is not visited , pushing it into stack.
//            while (it.hasNext())
//            {
//                int x = it.next();
//                if(!isVisited.get(x))
//                    st.push(x);
//            }
    	}
    }
    
    public void printGraph() {
    	for(int src=0 ; src<adj.length ; src++) {
//    		System.out.print(src);
//    		for(Integer dest : adj[src]) {
//    			System.out.print(" -> " + dest);
//    		}
    		System.out.println();
    	}
    }
}
