package LLD.BloomFilter;

public class BloomFilter {

    final int DEFAULT_SIZE = 16;
    int bloomFilterSize;
    boolean[] bloomFilter;
    
    BloomFilter() {
        bloomFilterSize = DEFAULT_SIZE;
        bloomFilter = new boolean[DEFAULT_SIZE];
    }

    BloomFilter(int size) {
        bloomFilterSize = size;
        bloomFilter = new boolean[size];
    }

    void add(Object o) {
        int hashKey = getHashKey(o);
        bloomFilter[hashKey] = true;
    }    

    boolean isPresent(Object o) {
        int hashKey = getHashKey(o);
        return bloomFilter[hashKey];

    }
    int getFilledLen() {
        int filled = 0;
        for(int i=0;i<bloomFilterSize;i++) filled += bloomFilter[i]?1:0;
        return filled;
    }
    private int getHashKey(Object o) {
        int hash = murmurHash(o);
        int key =  hash % bloomFilterSize;
        return key;
    }

    private int murmurHash(Object o) {
        Object hash = o.hashCode() & Integer.MAX_VALUE;
        for(int i=0;i<7;i++) {
            hash =  hash.hashCode() & Integer.MAX_VALUE;
        }
        return (int)hash;
    }



}
