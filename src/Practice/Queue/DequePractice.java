package Practice.Queue;

import Practice.Dto.Person;
import Practice.Interface.CollectionPractice;

import java.util.ArrayDeque;

public class DequePractice implements CollectionPractice<Person> {

    //  add(), offer(), poll(), remove(), peek(), element()
    // ___________________________________________________________________________________
    // | Operation         |  Throw Exception             | No Exception                |
    // __________________________________________________________________________________
    // | Insert Operation  |  addFirst(),addLast          | offerFirst(), offerLast()   |
    // | Remove Operation  |  removeFirst(), removeLast() | pollFirst(), pollLast()     |
    // | Examine Operation |  getFirst(), getLast()       | peekFirst(), peekFast()     |
    // __________________________________________________________________________________


    // Time Complexity
    // Deletion - O(1)
    // Insertion - O(1), Amortized - worstcase O(N) - when the capacity is full
    // Search - O(1) (i.e) Peek Operation
    // Space Complexity - O(N)

    @Override
    public void print(Person p) {
        ArrayDeque<Integer> adQueue = new ArrayDeque<>();

        // Insertion
        System.out.println("Queue Operation");
        adQueue.add(1);
        adQueue.add(2);
        // Print the Queue in order
        System.out.println("Queue Traversal");
        adQueue.forEach((Value) -> System.out.printf("%s ",Value));
        System.out.println();
        // Deletion
        System.out.println("Queue Deletion");
        while(!adQueue.isEmpty()) {
            System.out.printf("%s ", adQueue.poll());
        }
        System.out.println();

        // Stack Operation
        System.out.println("Stack Operation");
        ArrayDeque<Integer>  adStack = new ArrayDeque<>();
        // Insertion
        adStack.addFirst(1);
        adStack.addFirst(2);
        System.out.println("Stack Traversal");
        adStack.forEach((Value) -> System.out.printf("%s ",Value));
        System.out.println();

        // deletion
        System.out.println("Stack Deletion");
        while (!adStack.isEmpty()){
            System.out.printf("%s ", adStack.pollFirst());
        }
    }
}
