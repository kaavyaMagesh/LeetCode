class LRUCache {


class Node{
    int key;
    int value;

    Node next;
    Node prev;

    Node(int key,int val){
        this.key=key;
        this.value=val;
    }
}

HashMap<Integer,Node> map;

    int capacity;
Node head;
Node tail;


    public LRUCache(int capacity) {
        
        this.capacity=capacity;

        map=new HashMap<>();

        head=new Node(-1,-1);
        tail=new Node(-1,-1);

        head.next=tail;
        tail.prev=head;
    }
    
    private void insert(Node node){
       tail.prev.next=node;
       node.prev=tail.prev;

       node.next=tail;
       tail.prev=node;
    }

     private void remove(Node node){
 node.prev.next=node.next;
 node.next.prev=node.prev;
    }

    public int get(int key) {
       
        
        if(!map.containsKey(key)){
            return -1;
        }

         Node node=map.get(key);

         remove(node);
         insert(node);
         return node.value;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            Node oldnode=map.get(key);
            remove(oldnode);
            map.remove(key);
            
        }

         Node node=new Node(key,value);
            insert(node);
            map.put(key,node);

        if(map.size()> capacity){
Node lru=head.next;
remove(lru);
map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */