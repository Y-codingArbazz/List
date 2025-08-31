import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Create{
public static void main(String[]args){
  List<Integer> Lo=new ArrayList<>();
  Lo.add(9);
  Lo.add(8);
  Lo.add(7);
  Lo.add(6);
  Lo.add(5);
  // System.out.println(Lo);
  Iterator it=Lo.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
}
}
