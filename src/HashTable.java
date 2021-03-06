import java.util.*;
public class HashTable<K, V> {
    private class HTNode {
        K key;
        V value;

        public HTNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

    

        public String toString(){
            return "{" + this.key + " : " + this.value + "}";
        }
    }

    private LinkedList<HTNode>[] buckets;
    private int n;

    public static final int DEFAULT_CAPACITY = 10;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        this.buckets = (LinkedList<HTNode>[]) new LinkedList[capacity];
        this.n = 0;
    }

    public int size() {
        return this.n;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        String rv = "";

        rv += "******************************************\n";

        for(int i = 0; i < this.buckets.length; i++){
            if(this.buckets[i] != null){
                rv += this.buckets[i] + "\n";
            } else {
                rv += "NULL\n";
            }
        }

        rv += "******************************************\n";

        return rv;
    }

    public V get(K key) throws Exception {
        int bi = this.hashFunction(key);
        LinkedList<HTNode> bucket = this.buckets[bi];

        HTNode node = new HTNode(key, null);

        if (bucket == null) {
            return null;
        } else {

            int foundAt = bucket.indexOf(node);

            if (foundAt == -1) {
                return null;
            } else {
                HTNode foundNode = bucket.get(foundAt);
                return foundNode.value;
            }
        }
    }

    public V remove(K key) throws Exception {
        int bi = this.hashFunction(key);
        LinkedList<HTNode> bucket = this.buckets[bi];

        HTNode node = new HTNode(key, null);

        if (bucket == null) {
            return null;
        } else {
            int foundAt = bucket.indexOf(node);

            if (foundAt == -1) {
                return null;
            } else {
                HTNode foundNode = bucket.get(foundAt);

                bucket.remove(foundAt);
                this.n--;

                return foundNode.value;
            }
        }
    }

    public void put(K key, V value) throws Exception {
        int bi = this.hashFunction(key);
        LinkedList<HTNode> bucket = this.buckets[bi];

        HTNode node = new HTNode(key, value);

        if (bucket == null) {
            bucket = new LinkedList<>();
            bucket.addLast(node);

            this.n++;
            this.buckets[bi] = bucket;
        } else {
            int foundAt = bucket.indexOf(node);

            if (foundAt == -1) {
                bucket.addLast(node);
                this.n++;
            } else {
                HTNode foundNode = bucket.get(foundAt);
                foundNode.value = node.value;
            }
        }

        // rehashing
        double loadFactor = (this.n * 1.0) / this.buckets.length;

        if(loadFactor > 1.0){
            this.rehash();
        }
    }

    private void rehash() throws Exception {
        LinkedList<HTNode>[] oba = this.buckets;

        this.buckets = (LinkedList<HTNode>[]) new LinkedList[2 * oba.length];
        this.n = 0;

        for(int i = 0; i < oba.length; i++){
            LinkedList<HTNode> ob = oba[i];

            while(ob != null && !ob.isEmpty()){
                HTNode on = ob.removeFirst();
                this.put(on.key, on.value);
            }
        }
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode()) % this.buckets.length;
    }
public static Integer highestFreq(Integer[] arr) {
	HashTable ht=new HashTable<Integer,Integer>();
	int size=arr.length;
	while((size--)>0){
		ht.
	}
	
	
	
	
}
   public static void main(String[] args) throws Exception {
    	Scanner s= new Scanner(System.in);
    	int str= s.nextInt();
    	Integer[] num = new Integer[str];
    	
for(int i=0; i<str ; i++){
    		num[i]= s.nextInt();
    		
    	}
System.out.println(highestFreq(num));

    }
}