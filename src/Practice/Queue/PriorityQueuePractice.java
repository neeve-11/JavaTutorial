package Practice.Queue;

import Practice.Comparable.PersonComparable;
import Practice.Comparator.PersonComparator;
import Practice.Dto.Person;
import Practice.Interface.CollectionPractice;

import java.util.*;

public class PriorityQueuePractice implements CollectionPractice<String> {

    PriorityQueue<String> heap = new PriorityQueue<>();
    public static String[] stringInput = { "pizza", "briyani", "chocolate", "mintchipcookie" };
    public static Person[] personInput = { new Person("Siva", 65), new Person("neeve", 25), new Person("pava", 28), new Person("sasi", 55) };

    @Override
    public void print(String v) {

    }


    public void createMinHeap() {
        System.out.println("Printed using forEach utility");
        heap.addAll(Arrays.asList(stringInput));
        heap.forEach(System.out::println);

        System.out.println("------------------------------------");
        System.out.println("Printed as Default min-priority queue");
        while(!heap.isEmpty()){

           System.out.println(heap.poll());
       }
    }

    public void createMaxHeap() {

        // Comparator
        PriorityQueue<String> maxPq = new PriorityQueue<>((String a, String b) -> a.compareTo(b));
        maxPq.addAll(Arrays.asList(stringInput));

        // Comparator V/S  Comparable

        // Comparator is interface that provides provision to have own sorting logic using the compare method
        PriorityQueue<Person> comparatorPq1 = new PriorityQueue<>(new PersonComparator());
        PriorityQueue<Person> comparatorPq2 = new PriorityQueue<>((Person a, Person b) -> a.Name.compareTo(b.Name));
        PriorityQueue<Person> comparatorPq3 = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age < o2.age ? 1: -1;
            }
        });

        // Comparable
        // Need to call the comparable
        PriorityQueue<PersonComparable> comparablePq1 = new PriorityQueue<>();

        // ComparatorMax queue
        System.out.println("Comparator Max queue");
        comparatorPq3.addAll(Arrays.asList(personInput));
        while(!comparatorPq3.isEmpty()){
            var data = comparatorPq3.poll();
            System.out.printf("%s-%s\n", data.Name, data.age);
        }


        System.out.println("");
    }
}
