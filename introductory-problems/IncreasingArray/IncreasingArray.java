import java.util.*;
import java.io.*;

public class IncreasingArray {
  
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long length = Long.parseLong(reader.readLine());

    String input = reader.readLine();
    String[] splitted = input.split(" ");
    long[] arr = new long[splitted.length];
    for (int i = 0; i < splitted.length; i++) {
      arr[i] = Long.parseLong(splitted[i]);
    }

    long minimumMoves = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i-1]) {
        minimumMoves += Math.abs(arr[i] - arr[i-1]);
        arr[i] = arr[i-1];
      }
    }

    System.out.println(minimumMoves);
  }
}
