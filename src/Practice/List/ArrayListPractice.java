package Practice.List;

import Practice.Dto.Person;
import Practice.Interface.CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractice implements CollectionPractice<Person> {

    // ArrayList == Array
    // Time Complexity
    // Insertion
    // O(1) : At the end
    // O(N) : At a particular index - because of shifting
    // O(N) : The current threshold the array is reached

    // Delection
    // O(n ) - Left Shifting

    // Search
    // O(1)

    // Space Complexity - O(N)

    @Override
    public void print(Person p){
       List<Integer> l1 = new ArrayList<>();
       l1.add(1);
       l1.add(2);
       l1.add(3);

       System.out.println("L1 Traversal");
       l1.forEach(value -> System.out.printf("%s ", value));
       System.out.println();

       System.out.println("L2 Traversal");
       List<Integer> l2 = new ArrayList<>();
       l2.add(100);
       l2.add(200);
       l2.add(300);
       l2.forEach(value -> System.out.printf("%s ", value));
       System.out.println();

       System.out.println("L1 Replace Traversal");
       l1.replaceAll((value) -> value*-1);
       l1.forEach(value -> System.out.printf("%s ", value));
       System.out.println();


       System.out.println("List Iterator forward Traversal");
        ListIterator<Integer> listIterator = l1.listIterator();

        while (listIterator.hasNext()){
            int value = listIterator.next();

            System.out.printf("Traversing forward %s previous index %s next index %s\n", value, listIterator.previousIndex(), listIterator.nextIndex());
            if(value == -2){
                System.out.printf("Inserting 2\n");
                listIterator.add(2);
            }
        }
        System.out.println();

        System.out.println("L1 Traversal");
        l1.forEach(value -> System.out.printf("%s ", value));
        System.out.println();


        System.out.println("List Iterator backward Traversal");
        ListIterator<Integer> listbackIterator = l1.listIterator(4);

        while (listbackIterator.hasPrevious()){
            int value = listbackIterator.previous();

            System.out.printf("Traversing backward %s previous index %s next index %s\n", value, listbackIterator.previousIndex(), listbackIterator.nextIndex());
            if(value == 2){
                listbackIterator.set(4);
            }
        }

        System.out.println("L1 Traversal");
        l1.forEach(value -> System.out.printf("%s ", value));



    }

}
