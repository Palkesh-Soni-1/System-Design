package HashMap;

public class HashMap<K,V> {
    private int INITIAL_SIZE=1<<16;
    private int MAX_CAPACITY=1<<30;
    private Entry[] hashTable;
    public HashMap(){
        this.hashTable=new Entry[INITIAL_SIZE];
    }
    public HashMap(int capacity){
        int size = calculateSizeFor(capacity);
        this.hashTable=new Entry[size];
    }
    private int calculateSizeFor(int capacity){
        capacity--;
        capacity=capacity>>>1;
        capacity=capacity>>>2;
        capacity=capacity>>>4;
        capacity=capacity>>>8;
        capacity=capacity>>>16;
        return (capacity<0)?1:(capacity>MAX_CAPACITY)?MAX_CAPACITY:capacity+1;
    }
    public void put(K key, V value){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];
        if(node==null){
            Entry newNode=new Entry(key,value);
            hashTable[hashCode]=newNode;
            return;
        }
        while(node.next!=null){
            if(node.key==key){
                node.value=value;
                return;
            }
            node=node.next;
        }
        Entry newNode=new Entry(key,value);
        node.next=newNode;
        return;
    }
    public V get(K key){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node=hashTable[hashCode];
        if(node!=null){
            if(node.key==key){
                return (V)node.value;
            }
            node=node.next;
        }
        return null;
    }
}

class Entry<K,V>{
    public K key;
    public V value;
    public Entry next;

    public Entry(K key, V value){
        this.key=key;
        this.value=value;
    }
}