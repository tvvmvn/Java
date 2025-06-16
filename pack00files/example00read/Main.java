package pack00files.example00read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      File f = new File("/Users/jintaemin/lecture/Java/pack00files/upload-dir/writing.txt");
      
      Scanner scanner = new Scanner(f);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("error!");
      e.printStackTrace();
    }
  }
}
