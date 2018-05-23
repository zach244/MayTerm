import java.util.Iterator;

public class IterationAdapter implements Enumeration{
    Iterator<E> iterator;
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