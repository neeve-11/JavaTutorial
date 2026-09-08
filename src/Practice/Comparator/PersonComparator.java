package Practice.Comparator;

import Practice.Dto.Person;

import java.util.Comparator;

public class PersonComparator extends  Person implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        // if return 1, swap
        return o1.age > o2.age ? 1: -1;
    }
}