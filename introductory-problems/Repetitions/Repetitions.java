import java.io.*;

public class Repetitions {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        
        maxLength = Math.max(maxLength, currentLength);

        System.out.println(maxLength);
    }
}

