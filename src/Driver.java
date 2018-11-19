

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Array List: ");

        ALPriorityQueue alPriorityQueue = new ALPriorityQueue();
        alPriorityQueue.enqueue(2,10);
        alPriorityQueue.enqueue(1,20);
        alPriorityQueue.enqueue(0,30);

        System.out.println(alPriorityQueue.dequeueMin().getValue());
        System.out.println(alPriorityQueue.dequeueMin().getValue());
        System.out.println(alPriorityQueue.dequeueMin().getValue());

        System.out.println("Double Linked: ");
        DLPriorityQueue dlPriorityQueue = new DLPriorityQueue();
        dlPriorityQueue.enqueue(1, 100);
        dlPriorityQueue.enqueue(0, 200);
        dlPriorityQueue.enqueue(3, 300);
        dlPriorityQueue.enqueue(4, 400);

        System.out.println(dlPriorityQueue.dequeueMin().getValue());
        System.out.println(dlPriorityQueue.dequeueMin().getValue());
        System.out.println(dlPriorityQueue.dequeueMin().getValue());
        System.out.println(dlPriorityQueue.dequeueMin().getValue());



    /*    Scanner in = new Scanner(System.in);
        System.out.println("=========MENU==========");
        System.out.println("1- Array List");
        System.out.println("2- Double Linked");
        System.out.println("3- Binary Heap");
        System.out.println("0 - Exit");
        System.out.println("Enter: ");
        int menu = in.nextInt();
        while (menu != 0){
            switch (menu) {
                case 1:
            }
        }*/
    }
}
