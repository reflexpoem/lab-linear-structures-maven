import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.grinnell.csc207.util.StringComparator;
import edu.grinnell.csc207.util.IntComparator;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.linear.BuiltinPriorityQueue;
import edu.grinnell.csc207.linear.PriorityQueue;

public class BuiltInPriorityQueueTest{
  BuiltinPriorityQueue<String> stringq;
  BuiltinPriorityQueue<Integer> intq;

  Comparator<String> stringComparator = new StringComparator();
  Comparator<Integer> intComparator = new IntComparator();

  public void create() throws Exception{
    stringq = new BuiltinPriorityQueue<String>(8, stringComparator);
    intq = new BuiltinPriorityQueue<Integer>(8, intComparator);
  }



  
}
