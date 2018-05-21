
import java.io.*;

public class FlameInputStream extends FilterInputStream
{
 public FlameInputStream(InputStream is) {
  super(is);
 }

 public int read() throws IOException {
  int c = super.read();
    
    c = Character.toUpperCase(c);

  return c;
 }
}