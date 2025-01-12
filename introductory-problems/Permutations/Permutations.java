import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
  
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(reader.readLine());
    if (n == 1) {
      System.out.println(1);
    } else if (n == 2 || n == 3) {
      System.out.println("NO SOLUTION");
    } else {
      StringBuilder result = new StringBuilder();

      //  append even numbers first
      for (int i = 2; i <= n; i += 2) {
        result.append(i).append(" ");
      }

      // append odd numbers then
      for (int i = 1; i <= n; i += 2) {
        result.append(i).append(" ");
      }

      System.out.println(result.toString().trim());
    }

  }
}
