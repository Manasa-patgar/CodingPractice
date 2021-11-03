package Coding;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationQueues
{

    //1 2 3 4 5
    // q1 -  2
    // q2  - 2 1

   static LinkedList<Integer> queue1 = new LinkedList<>();
    static LinkedList<Integer> queue2 = new LinkedList<>();

    public static void push(int i)
    {
       if(queue1.size() == 0 || queue1.size() ==1)
       {
           if(queue1.isEmpty())
             queue1.push(i);
           else
           {
               while(!queue1.isEmpty())
               {
                   queue2.push(queue1.poll());
               }
               queue1.push(i);
           }
       }
       else
       {
           while(!queue2.isEmpty())
           {
               queue1.push(queue2.poll());
           }
           queue2.push(i);

       }


    }

    public static void pop()
    {

        if(queue1.size() == 1)
        {
          System.out.println(queue1.poll());

        }
        else if (queue2.size() == 1)
        {
            System.out.println(queue2.poll());

        }
        else if(queue1.isEmpty() && !queue2.isEmpty())
        {
            System.out.println(queue2.poll());
        }
        else if(queue2.isEmpty() && !queue1.isEmpty())
        {
            System.out.println(queue1.poll());
        }
        else
        {
            System.out.println("No elemets");
        }

    }
    public static void main(String args[])
    {


        push(1);
        push(2);
        pop();
        push(3);
        pop();
        push(4);
        pop();





    }


    //Twitter
    //compoent-authserver
    //LoadBalancer
    //component-account -> users
    //component-tweet -> userId -> tweets
    //component-followers -> userId - set<Followers>
    //Kibana - logging
    //Performace - Threading


}
