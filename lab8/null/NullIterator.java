import java.util.Iterator;

public class NullIterator implements Iterator{
    public boolean hasNext(){
        return false;
    }
    public Object next(){
        return false;
    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
}