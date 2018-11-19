

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ALPriorityQueue alPriorityQueue = new ALPriorityQueue();
        DLPriorityQueue dlPriorityQueue = new DLPriorityQueue();


        alPriorityQueue.enqueue(2, 10);
        alPriorityQueue.enqueue(0, 20);
        alPriorityQueue.enqueue(1, 30);

        System.out.println("Array List - dequeue: ");
        for (int i = 0; i < 3; i++) {
            Entry entry = alPriorityQueue.dequeueMin();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        dlPriorityQueue.enqueue(1, 100);
        dlPriorityQueue.enqueue(3, 200);
        dlPriorityQueue.enqueue(2, 300);
        dlPriorityQueue.enqueue(0, 400);

        System.out.println("\nDouble Linked - dequeue: ");
        for (int i = 0; i < 4; i++) {
            Entry entry = dlPriorityQueue.dequeueMin();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}




/*Scanner in = new Scanner(System.in);
System.out.println("=========MENU==========");
System.out.println("1- Array List");
System.out.println("2- Double Linked");
System.out.println("3- Binary Heap");
System.out.println("0 - Exit");
System.out.println("Enter: ");
int menu = in.nextInt();
while (menu != 0) {
    switch (menu) {
        case 1:
            System.out.println("1- Enqueue: ");
            System.out.println("2- Dequeue: ");
            System.out.println("0- Exit");
            menu = in.nextInt();

            if (menu == 1) {
                System.out.println("Array List - enqueue: ");
                alPriorityQueue.enqueue(2, 10);
                alPriorityQueue.enqueue(1, 20);
                alPriorityQueue.enqueue(0, 30);


            } else if (menu == 2) {
                if (dlPriorityQueue.isEmpty()) {
                    System.out.println("Empty List!");
                } else {
                    System.out.println("Array List - dequeue: ");
                    System.out.println(alPriorityQueue.dequeueMin().getValue());
                    System.out.println(alPriorityQueue.dequeueMin().getValue());
                    System.out.println(alPriorityQueue.dequeueMin().getValue());

                }
            }
            break;

        case 2:
            System.out.println("1- Enqueue: ");
            System.out.println("2- Dequeue: ");
            System.out.println("0- Exit");
            menu = in.nextInt();
            if (menu == 1) {
                System.out.println("Double Linked - enqueue: ");
                dlPriorityQueue.enqueue(1, 100);
                dlPriorityQueue.enqueue(0, 200);
                dlPriorityQueue.enqueue(3, 300);
                dlPriorityQueue.enqueue(4, 400);
            } else if (menu == 2) {
                if (dlPriorityQueue.isEmpty()) {
                    System.out.println("Empty List!");
                } else {
                    System.out.println("Double Linked - dequeue: ");
                    System.out.println(dlPriorityQueue.dequeueMin().getValue());
                    System.out.println(dlPriorityQueue.dequeueMin().getValue());
                    System.out.println(dlPriorityQueue.dequeueMin().getValue());
                    System.out.println(dlPriorityQueue.dequeueMin().getValue());
                }
            }
            break;

    }
}*/
