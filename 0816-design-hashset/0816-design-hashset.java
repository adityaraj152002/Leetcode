class MyHashSet {
     Set<Integer> h=new HashSet<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        h.add(key);
    }
    
    public void remove(int key) {
        h.remove(key);
        
    }
    
    public boolean contains(int key) {
        return h.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */