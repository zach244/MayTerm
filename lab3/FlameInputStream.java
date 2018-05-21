
import java.io.*;

public class FlameInputStream extends FilterInputStream
{
 public FlameInputStream(InputStream is) {
  super(is);
 }

 public int read() throws IOException {
  int c = super.read();
  if (c >= 0)
   c++;

  return c;
 }
}