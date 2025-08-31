import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.AttributeSet.ColorAttribute;

public class Dynamic{
public static void main(String[]args){
  List<Person> ok=new ArrayList<>();
  ok.add(new Person("Azzy", 1, "Cool", 'm'));
  ListIterator<Person> op=ok.listIterator();
  while(op.hasNext()){
    System.out.println(op.next());
  }
  
  
  // Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
}
}
