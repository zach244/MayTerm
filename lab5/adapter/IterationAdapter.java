import java.util.Enumeration;
import java.util.Iterator;

public class IterationAdapter implements Enumeration{
    Iterator iterator;
public IterationAdapter(Iterator iterator){
    this.iterator = iterator;
}
public boolean hasMoreElements(){
  return iterator.hasNext();
}
public Object nextElement(){
   return iterator.next();
}
}
