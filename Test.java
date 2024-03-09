import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CollectionPerformanceTest {
    public static void main(String[] args) {
        
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        adds(hashSet);
        adds(treeSet);
        adds(linkedHashSet);
        adds(arrayList);
        adds(linkedList);
        adds(arrayDeque);
        adds(priorityQueue);
        puts(hashMap);
        puts(treeMap);
        puts(linkedHashMap);
        
        add100(hashSet,"HashSet");
        containsNo(hashSet,"HashSet");
        removeItem(hashSet,"HashSet");
        clearItem(hashSet,"HashSet");

        add100(treeSet,"TreeSet");
        containsNo(treeSet,"TreeSet");
        removeItem(treeSet,"TreeSet");
        clearItem(treeSet,"TreeSet");

        add100(linkedHashSet,"LinkedHashSet");
 containsNo(linkedHashSet,"LinkedHashSet");
 removeItem(linkedHashSet,"LinkedHashSet");
 clearItem(linkedHashSet,"LinkedHashSet");

 add100(arrayList,"ArrayList");
 containsNo(arrayList,"ArrayList");
 removeItem(arrayList,"ArrayList");
 clearItem(arrayList,"ArrayList");

 add100(linkedList,"LinkedList");
 containsNo(linkedList,"LinkedList");
 removeItem(linkedList,"LinkedList");
 clearItem(linkedList,"LinkedList");

 add100(arrayDeque,"ArrayDequeue");
 containsNo(arrayDeque,"ArrayDequeue");
 removeItem(arrayDeque,"ArrayDequeue");
 clearItem(arrayDeque,"ArrayDequeue");

 add100(priorityQueue,"PriorityQueue");
 containsNo(priorityQueue,"PriorityQueue");
 removeItem(priorityQueue,"PriorityQueue");
 clearItem(priorityQueue,"PriorityQueue");

 put100(hashMap,"HashMap");
 containsKey(hashMap,"HashMap");
 removeItem(hashMap,"HashMap");
 clearItem(hashMap,"HashMap");

 put100(treeMap,"TreeMap");
 containsKey(treeMap,"TreeMap");
 removeItem(treeMap,"TreeMap");
 clearItem(treeMap,"TreeMap");

 put100(linkedHashMap,"LinkedHashMap");
 containsKey(linkedHashMap,"LinkedHashMap");
 removeItem(linkedHashMap,"LinkedHashMap");
 clearItem(linkedHashMap,"LinkedHashMap");
 
 }
 public static void adds(Collection col){
  while (col.size() < 100000) {
    int randomNumber = ThreadLocalRandom.current().nextInt(0, 1000000);
    col.add(randomNumber);
     
  }
}

public static void puts(Map map){
  while (map.size() < 100000) {
    int randomNumber = ThreadLocalRandom.current().nextInt(0, 1000000);
    map.put(randomNumber,randomNumber);
     
 }
}

public static void add100(Collection col, String type){
  int numberOfTests = 100;
  
  long addTime=0;
  long startTime=0, endTime=0, totalTime=0;
  
  for (int i = 0; i < numberOfTests; i++)
   {
      int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
      startTime = System.nanoTime();
      col.add(randomNumber);
      endTime = System.nanoTime();
      
      addTime =addTime+(endTime - startTime);
   }
  
  totalTime = addTime / numberOfTests;
  System.out.println(type+" Add: " + totalTime);
}
public static void put100(Map map, String type){
  int numberOfTests = 100;
  long addTime=0;
  long startTime=0, endTime=0, totalTime=0;
  
  for (int i = 0; i < numberOfTests; i++)
   {
      int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
      startTime = System.nanoTime();
      map.put(randomNumber,randomNumber);
      endTime = System.nanoTime();
      
      addTime =addTime+(endTime - startTime);
   }
  
  totalTime = addTime / numberOfTests;
  System.out.println(type+" Add: " + totalTime);
}

public static void containsNo(Collection col, String type){
  long addTime=0;
  int numberOfTests = 100;
  long startTime=0; long endTime=0; long totalTime=0;

  for (int i = 0; i < numberOfTests; i++)
       {
          int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
          startTime = System.nanoTime();
          col.contains(randomNumber);
          endTime = System.nanoTime();
          
          addTime =addTime+(endTime - startTime);
       }
      
      totalTime = addTime / numberOfTests;
      System.out.println(type+" Contains: " + totalTime);

    }

    public static void containsKey(Map map, String type){
      long addTime=0;
      int numberOfTests = 100;
      long startTime=0; long endTime=0; long totalTime=0;
      for (int i = 0; i < numberOfTests; i++)
       {
          int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
          startTime = System.nanoTime();
          map.containsKey(randomNumber);
          endTime = System.nanoTime();
          
          addTime =addTime+(endTime - startTime);
       }
      
      totalTime = addTime / numberOfTests;
      System.out.println(type+" Contains: " + totalTime);

    }
    public static void removeItem(Collection col, String type){
      long addTime=0;
      int numberOfTests = 100;
        long startTime=0; long endTime=0;long totalTime=0;
        for (int i = 0; i < numberOfTests; i++)
         {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
            startTime = System.nanoTime();
            col.remove(randomNumber);
            endTime = System.nanoTime();
            
            addTime =addTime+(endTime - startTime);
         }
        
        totalTime = addTime / numberOfTests;
        System.out.println(type+" Remove: " + totalTime);

    }

    public static void removeItem(Map map,String type){
      long addTime=0;
      int numberOfTests = 100;
        long startTime=0; long endTime=0;long totalTime=0;
        for (int i = 0; i < numberOfTests; i++)
         {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
            startTime = System.nanoTime();
            map.remove(randomNumber);
            endTime = System.nanoTime();
            
            addTime =addTime+(endTime - startTime);
         }
        
        totalTime = addTime / numberOfTests;
        System.out.println(type+" Remove: " + totalTime);

    }
    public static void clearItem(Collection col, String  type ){
      long addTime=0;
      int numberOfTests = 100;
        long startTime=0; long endTime=0;long  totalTime=0;
        for (int i = 0; i < numberOfTests; i++)
         {
            //int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
            startTime = System.nanoTime();
            col.clear();
            endTime = System.nanoTime();
            addTime =addTime+(endTime - startTime);
         }
        
        totalTime = addTime / numberOfTests;
        System.out.println(type+" Clear: " + totalTime);
        System.out.println("");
    }

    public static void clearItem(Map map, String  type ){
      long addTime=0;
      int numberOfTests = 100;
        long startTime=0; long endTime=0;long  totalTime=0;
        for (int i = 0; i < numberOfTests; i++)
         {
            //int randomNumber = ThreadLocalRandom.current().nextInt(0, 100000);
            startTime = System.nanoTime();
            map.clear();
            endTime = System.nanoTime();
            addTime =addTime+(endTime - startTime);
         }
        
        totalTime = addTime / numberOfTests;
        System.out.println(type+" Clear: " + totalTime);
        System.out.println("");
    }
}