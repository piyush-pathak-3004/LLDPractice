package LLD.CacheLLD;

public class Cache {
    Storage store;
    EvictionPolicy evictionPolicy;

    public Cache(Storage store, EvictionPolicy evictionPolicy) {
        this.store = store;
        this.evictionPolicy = evictionPolicy;
    }

    public void put(String key, String val) {
        if(store.isFull()) {
            evictionPolicy.evict(store);
        }
        store.add(key, val);
    }

    public String get(String key) {
        return store.read(key);
    }
    

}
