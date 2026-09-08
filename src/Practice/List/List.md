
            __________________________________
            |       Iterable (Interface)    |
            |_______________________________|
                          |
                Collection (Interface)
                          |
                         List (Interface) ---------
                          |                       |
                       LinkedList (Class)        Vector (Class)
                                                  |
                                                 Stack (Class)





List specific functions
1. add(index, element)
2. addAll(index, collection)
3. replaceAll(element)
4. indexOf(element)
5. set(index, element)
6. lastIndexOf(element)
7. listIterator()            
   7.1. hasPrevious()
   7.2. previous()
   7.3. nextIndex()
   7.4. previousIndex()
   7.5. set(element)
   7.6. add(element)
8. listIterator(index)
9. subList(fromIndex, toIndex) - FromIndex - inclusive - ToIndex - Exclusive

______________________________________________________________________________________________________________________________________
|  Collection    | ThreadSafe  | Maintain Insertion Order | Null Element Allowed | Duplicate Element allowed | ThreadSafe Version    |
______________________________________________________________________________________________________________________________________
|  ArrayList     |   No        |  Yes                     | Yes                  | Yes                       | CopyOnWriteArray      |
|  LinkedList    |   No        |  Yes                     | Yes                  | Yes                       | CopyOnWriteArrayList  |
|  Stack         |   Yes       |  No                      | Yes                  | Yes                       | N/A                   |


Vector
1. Vector is same as ArrayList, but it's threadsafe.
2. Less efficient than ArrayList as for each operation it do lock/unlock internally.

Stack
// Time Complexity
// Deletion - O(1)
// Insertion - O(1), Amortized - worstcase O(N) - when the capacity is full
// Search - O(N) 
// Space Complexity - O(N)
1. Stack is thread-safe

