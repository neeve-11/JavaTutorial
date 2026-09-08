package Practice.List;

import Practice.Dto.Person;
import Practice.Interface.CollectionPractice;

import java.util.LinkedList;

public class LinkedListPractice implements CollectionPractice<Person> {


    // Time Complexity
    // Insertion
    // O(1): start and end
    // O(N): Lookup for the index O(N) and O(1) adding
    // Search: O(N)
    // Delection
    // O(1): start and end
    // O(N): Lookup for the index O(N) and O(1) removal

    //Space Complexity: O(N)

    @Override
    public void print(Person p){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);

        System.out.println("L1 Traversal");
        l1.forEach((l) -> System.out.printf("%s ", l));

    }
}
