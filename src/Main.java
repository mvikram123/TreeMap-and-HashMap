import java.util.HashMap;
import java.util.TreeMap;

//public class Main {
//    public static void main(String[] args) {
//
//        TreeMap<String,Integer> ages=new TreeMap<>();
//        ages.put("alice",30);
//        ages.put("bob",24);
//        ages.put("tommy",25);
//        ages.put("sahil",89);
//        System.out.println(ages);
//        System.out.println("alice age="+ages.get("alice"));
//    }
//}
//output={alice=30, bob=24,sahil=89, tommy=25}  it means output will come always in a sorted order


//TreeMap:
//
//       Time Complexity Best Case ,average,worst:
//        Insertion: O(log n)
//        Deletion: O(log n)
//        Retrieval: O(log n)




  public class Main{
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 28);

        System.out.println(ages);
       // System.out.println("Bob's age: " + ages.get("Bob"));
    }
}

// output={Bob=25, Alice=30, Charlie=28}  it means out will not come in sorted order.

//time complexity=O(1)


//HashMap:
//
//       average and Best Case Time Complexity:
//        Insertion: O(1)
//        Deletion: O(1)
//        Retrieval: O(1)

//      Worst Case Time Complexity:
//
//        Insertion: O(n)
//        Deletion: O(n)
//        Retrieval: O(n)
