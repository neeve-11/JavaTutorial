package Practice.Comparable;

import Practice.Dto.Person;

public class PersonComparable extends Person implements Comparable<Person> {
    @Override
    public int compareTo(Person o) {
        return this.age > o.age ?-1: 1 ;
    }
}
