import java.util.Iterator;

public class NullIterator implements Iterator{
    public boolean hasNext(){
        return false;
    }
    public E next(){
        return E;
    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
}