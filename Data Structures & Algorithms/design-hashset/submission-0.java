class MyHashSet {
    
    class Node{
        int key;
        Node next;


        public Node(int key,Node next){
            this.key=key;
            this.next=next;
        }
    }

    Node[] buckets;


    public MyHashSet() {
        buckets = new Node[1000];
    }
    
    public void add(int key) {
        int index = key%buckets.length;
        Node current = buckets[index];
        while(current!=null){
            if(current.key==key){
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key,null);
        newNode.next=buckets[index];
        buckets[index]=newNode;
    }
    
    public void remove(int key) {
        int index= key % buckets.length;
        Node current = buckets[index];
        Node previous=null;
        while(current!=null){
            if(current.key==key){
                if(previous==null){
                    buckets[index]=current.next;
                    break;
                }else{
                    previous.next=current.next;
                    break;
                }
            }
            previous=current;
            current=current.next;
        }
        
    }
    
    public boolean contains(int key) {
        int index = key % buckets.length;
        Node current = buckets[index];
        while (current != null) {
           if (current.key == key) {
            return true;
            }
        current = current.next;
    }
    return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */