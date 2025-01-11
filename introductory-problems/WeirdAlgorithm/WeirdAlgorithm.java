import java.io.*;
import java.util.*;

class WeirdAlgorithm {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long n = Integer.parseInt(reader.readLine());

    StringBuilder sb = new StringBuilder();
    sb.append(n + " ");
    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;
        sb.append(n + " ");
      }
      else {  
        n = 3 * n + 1;
        sb.append(n + " ");
      }
    }

    System.out.println(sb.toString().trim());
    
  }
}
