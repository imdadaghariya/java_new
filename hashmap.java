package Java_new;
import java.util.HashMap;

public class hashmap {
    public static void main(String []args){
        System.out.println("Hash Map");
        HashMap <String, Integer> Fruits = new HashMap<>();
        Fruits.put("Apple", 50);
        Fruits.put("Orange", 60);
        Fruits.put("Pineapple", 80);
        Fruits.put("Kiwi", 70);
        Fruits.put("Strawberry", 90);
        System.out.println(Fruits);
        System.out.println(Fruits.get("Apple"));
        System.out.println(Fruits.size());


        HashMap <Integer, Integer> Occurence= new HashMap<>();
        Occurence.put(1, 1 );
        Occurence.put(2, 5);
        System.out.println(Occurence);
        int num = Occurence.get(1)+1;
        System.out.println(num);
    }
    
}
