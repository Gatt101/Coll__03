import java.util.Vector;

public class Array{
    public static void main(String[] args) {
        Vector<String> mammals=new Vector<>();
    
    mammals.add("dog");
    mammals.add("cat");
    
    mammals.add(2, "horse");
        System.out.println( "Vector :"+mammals);
    
    
    Vector<String> animals=new Vector<>();
    animals.addAll(mammals);
    animals.add("Donkey");
        System.out.println("New Vector: "+animals);

String element=animals.get(2);
System.out.println("Element at index 2: "+element);

animals.removeElementAt(1);
System.out.println("New Vector: "+animals);
animals.insertElementAt("Snake",2);
System.out.println("New Vector: "+animals);





 
    
    }
}
