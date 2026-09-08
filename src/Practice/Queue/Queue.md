
   _________________________________
   |       Iterable (Interface)    |
   |_______________________________|
                 |
       Collection (Interface)
                 |
              Queue (Interface)
                 |
           ______|____________
          |                   |
   (Class)   PriorityQueue   Deque (Interface)    --------|
                              |                           |
                             ArrayDeque (Class)        LinkedList(Class)   



1. PriorityQueue/ArrayDeque is not Thread-Safe.

______________________________________________________________________________________________________________________________________
|  Collection    | ThreadSafe  | Maintain Insertion Order | Null Element Allowed | Duplicate Element allowed | ThreadSafe Version    |
______________________________________________________________________________________________________________________________________
|  PriorityQueue |   No        |  No                      | No                   | Yes                       | PriorityBlockingQueue |
|  ArrayDeque    |   No        |  Yes                     | No                   | Yes                       | ConcurrentLinkedQueue |
