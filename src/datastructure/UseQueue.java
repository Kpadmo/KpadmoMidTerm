package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        queue.remove(2);
        for (Integer item : queue) {
            System.out.println(queue);
        }
        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);

        while (!queue.isEmpty()) {
            Integer i = queue2.remove();
            if (i == 2)
                queue.add(90);

            System.out.println(queue2);
        }
    }

}


