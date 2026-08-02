class LRUCache {

    // Doubly Linked List Node
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Maps key -> corresponding node in the linked list
    HashMap<Integer, Node> map;

    int capacity;

    // Dummy head and tail nodes
    // head <-> ...actual nodes... <-> tail
    Node head;
    Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        // Create dummy nodes
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        // Initially head is connected directly to tail
        head.next = tail;
        tail.prev = head;
    }

    // Remove a node from the linked list
    private void remove(Node node) {

        Node previous = node.prev;
        Node nextNode = node.next;

        previous.next = nextNode;
        nextNode.prev = previous;
    }

    // Insert a node just before the tail
    // This makes it the Most Recently Used (MRU)
    private void insert(Node node) {

        Node previous = tail.prev;

        previous.next = node;
        node.prev = previous;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {

        // Key not found
        if (!map.containsKey(key))
            return -1;

        // Fetch the node
        Node node = map.get(key);

        // Since it was accessed,
        // move it to the end (Most Recently Used)
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        // If key already exists
        if (map.containsKey(key)) {

            // Remove old node from DLL
            Node oldNode = map.get(key);
            remove(oldNode);

            // Remove old mapping
            map.remove(key);
        }

        // Create new node
        Node newNode = new Node(key, value);

        // Insert into DLL
        insert(newNode);

        // Insert into HashMap
        map.put(key, newNode);

        // Capacity exceeded
        if (map.size() > capacity) {

            // First real node = Least Recently Used
            Node lru = head.next;

            // Remove it from DLL
            remove(lru);

            // Remove it from HashMap
            map.remove(lru.key);
        }
    }
}