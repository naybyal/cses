import java.util.*;
import java.io.*;

class MissingNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    long n = Integer.parseInt(reader.readLine());
    String inputLine = reader.readLine();
    String[] numbers = inputLine.split(" ");

    long[] arr = new long[numbers.length];
    
    long actualSum = 0; 
    for (int i = 0; i < numbers.length; i++) {
      arr[i] = Integer.parseInt(numbers[i]);
      actualSum += arr[i];
    }

    long expectedSum = n * (n + 1) / 2;
    long missingNumber = expectedSum - actualSum;
    System.out.println(missingNumber);
  }
}
