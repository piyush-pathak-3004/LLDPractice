package LLD.CacheLLD;

public class EvictionPolicy {

    public void evict(Storage store) {
        store.store.remove(store.head.key);
        store.head = store.head.next;
    }

}
