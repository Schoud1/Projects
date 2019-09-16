public class BST<Key extends Comparable<Key>, Value>{
    
    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int count; 
        
        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }
    
    private Node root;



public Value get(Key key) {
        return get(root,key)
        
        private Value get(Node n, Key key)
        if (n == null) {
            return null;
            
            int cmp = key.compareTo(n.key);
            
            if (cmp < 0)        // key < n.key
                return get(n.left, key);
            
            else if (cmp > 0)   // key > n.key
                return get(n.right, key);
            
            else                // key == n.key   (found it!)
                return(n.val);
        }
       
       public void put(Key key, Value val){
           root = put(root, key, val);
           
       }
       
       private Node put(Node n, Key key, Value val){
           if (n == null) 
            return new Node(key,val);
       }
       
       int cmp = key.compareTo(n.key);
       
       if (cmp < 0)        // key < n.key
                n.left = put(n.left, key, val);
            
            else if (cmp > 0)   // key > n.key
                n.right = put(n.right, key, val);
            
            else                // key == n.key   (found it!)
               n.val = val;
               
               return n;
    }
    
    public Iterable<Key> keysInOrder() {
        Queue<Key> q = new QueueArray<Key>();
        enqueueKeysInOrderFromNode(root, q);
        return q;
    }
    
    private void enqueueKeysInOrderFromNode(Node n, Queue<Key> q) {
        if (n == null) return;
        enqueueKeysInOrderFromNode(n.left, q);
        q.enqueue(n.key);
        enqueueKeysInOrderFromNode(n.right,q);
    }
}
