

                                  _______________________
                                 |  Map   (Interface)    |
            ___________________  |_______________________|_________________________________________
            |                                  |                             |                       |
     _______|__________             ___________|____________       __________|__________    _________|_____________
    |SortedMap(Inter) |             |     HashMap (Class)    |     |    HashTable(Class) |  |  LinkedHashMap(Class) |
    |________________ |             |________________________|     |_____________________|  |_______________________|
            |
   |--------------------
   |   TreeMap(Class)   |
   |____________________|






Function of Map Interface
1. size()
2. isEmpty()
3. containsKey(keyValue)
4. containsValue(Value)
5. get(keyValue)
6. put(key, value)
7. remove(key)



HashMap
1. Load Factor
2. Entry<K, V> Interface
3. Rehashing
4. Performance

How hashmap store value ?
    1. It is a array of Node - hash, key, value, next
    2. Default initial capacity - 16
    3. put method works - put(key, value)
       3.1. hash(key) % size of hashmap  

    Node - hash = hash(key)
     |---LinkedList in array index 0
    [[{hash:123, key: 1, value: 10, next: ->}, {hash:124, key: 10, value: 11, next: ->}], null, [{hash:190, key: 90, value: 100, next: ->}]]
                               |                                                           |                        |
                             array index 0                                              index 1                  index 2
       
    4. Hashcode and Equal - Hashcode = hash(e)
       4.1. ob1 == ob2, then their hash should be same
       4.2. Hash is same, then 2 object is not same
    5. LoadFactor - To reduce collision by incresing the size of map
            Size *  LoadFactor(0.75) :  (eg) 16 * .75 = 12   
        5.1. When a  linkedlist size reaches the Size * LoadFactor(0.75) threashold. Then changes the size of map and rehash the table.
    6. TREEIFY_THRESHOLD
        6.1. When the linkedlist reaches TREEIFY_THRESHOLD, then convert the linkedlist into Balanced Binary Serach Tree/Red-Black Tree/AVL

Time Complexity
1. Insertion, Deletion, Search - O(1)
2. Worst Case - LinkedList - O(N)
                Tree       - O(LOG n)

HashMap
1. HashMap is not thread safe. HashTable/ConcurrentHashMap is thread-safe, is a synchronized version of hashmap
2. HashMap can store null key/value. Hashtable do not contain null key/value
3. HashMap do not maintain insertion order




