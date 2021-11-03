package Coding;

import java.util.*;

    public  class Graphs
    {
         int V;   // No. of vertices
         LinkedList<Integer> adj[]; //Adjacency Lists



        Graphs(int v)
        {
            this.V = v;
            this.adj = new LinkedList[v];
            for(int i = 0; i < v; i++)
                adj[i] = new LinkedList();
        }

        void addEdge(int s, int e)
        {
            adj[s].add(e);

        }

        void BFS(int source)
        {
            Queue<Integer> queue = new LinkedList<>();

            boolean visited[] = new boolean[V];

            queue.add(source);
            visited[source] = true;

            while(!queue.isEmpty())
            {
                source = queue.poll();
                System.out.print(source +" ");

                Iterator<Integer> itr = adj[source].listIterator();
                while (itr.hasNext())
                {
                    int s = itr.next();
                    if(!visited[s])
                    {
                        queue.add(s);
                        visited[s] = true;
                    }

                }
            }
        }

        void DFS(int source)
        {
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[V];
            stack.push(source);
            visited[source] = true;


            while (!stack.empty())
            {
                 source = stack.pop();

                System.out.print(source+ " ");

                Iterator<Integer> itr = adj[source].listIterator();
                while (itr.hasNext())
                {
                    int s = itr.next();
                    if(!visited[s])
                    {
                        visited[s] = true;
                        stack.push(s);
                    }
                }
            }
        }


    public static void main(String args[])
    {
        Graphs g = new Graphs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2);


    }
}
