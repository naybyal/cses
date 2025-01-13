import java.io.*;
import java.util.*;

public class NumberSpiral {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

    int t = Integer.parseInt(reader.readLine());
    
    while (t-- > 0) {
      String[] input = reader.readLine().split(" ");
      long y = Long.parseLong(input[0]);
      long x = Long.parseLong(input[1]);

      long maximum = Math.max(x, y);
      long square = (maximum - 1) * (maximum - 1);

      long answer;
      if (maximum % 2 == 0) {
        if (x > y) {
          answer = square + y;
        } else {
          answer = (maximum * maximum) - x + 1;
        }
      } else {
        if (x > y) {
          answer = (maximum * maximum) - y + 1;
        } else {
          answer = square + x;
        }
      }
    
      writer.println(answer);
    }

    writer.flush();
  }
}
