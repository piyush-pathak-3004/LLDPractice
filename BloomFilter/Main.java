package LLD.BloomFilter;

import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] dataSet = new String[1000];
        String[] testSet = new String[1000];
        Map<String, Integer> dataSetHashMap = new HashMap<>();

        for(int i=0;i<1000;i++) {
            UUID uuid = UUID.randomUUID();
            String uuidString = uuid.toString();
            dataSet[i] = uuidString;
        }
        for(int i=0;i<1000;i++) {
            UUID uuid = UUID.randomUUID();
            String uuidString = uuid.toString();
            testSet[i] = uuidString;
        }

        for(int k=1000;k<=50000;k++) {
            BloomFilter bloomFilter = new BloomFilter(k);

            for(int i=0;i<dataSet.length;i++) {
                bloomFilter.add(dataSet[i]);
                dataSetHashMap.put(dataSet[i], 1);
            }
            int falsePositive = 0;

            for(int j=0;j<testSet.length;j++) {
                if(!dataSetHashMap.containsKey(testSet[j]) && bloomFilter.isPresent(testSet[j])) {
                    falsePositive++;
                }
            }
            System.out.println(100* (falsePositive/(float)1000) );
        }
        
    }
}
