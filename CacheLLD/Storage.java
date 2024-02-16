package LLD.CacheLLD;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    int size;
    Map<String, DLL> store;
    DLL head, tail;

    public Storage(int size) {
        this.size = size;
        store = new HashMap<String, DLL>(size);
        head = null;tail = null; 
    }

    public void add(String key, String val) {

        if(store.containsKey(key)) {
            DLL node = store.get(key);
            node.val = val;
            removeConnection(node);
            addRecentlyUsed(node);

        } else {
            
            DLL node = new DLL();
            node.next = null;
            node.prev = null;
            node.key = key;
            node.val = val;
            if(tail == null) {
                head = node;
                tail = node;
            } else {
                addRecentlyUsed(node);
            }
            
        }

        

    }

    private void addRecentlyUsed(DLL node) {
        node.prev = tail;
        node.next = null;
        tail = node;
    }

    private void removeConnection(DLL node) {
        if(node.next != null) {
            node.next.prev = node.prev;
        } 
        if(node.prev !=  null) {
            node.prev.next = node.next;
        }
    }

    public String read(String key) {
        return store.get(key).val;
    }

    public boolean isFull() {
        return size == store.size();
    }

}


/*





*/ 