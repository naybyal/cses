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

      long result;

      if (y >= x) {
        if (y % 2 == 1) {
          result = y * y - x + 1;
        } else {
          result = (y - 1) * (y - 1) + x;
        }
      } else {
        if (x % 2 == 1) {
          result = x * x - y + 1;
        } else {
          result = (x - 1) * (x - 1) + y;
        }
      }
    
      writer.println(result);
    }

    writer.flush();
  }
}
