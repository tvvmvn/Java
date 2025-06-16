package pack00files.example00write;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("/Users/jintaemin/lecture/Java/pack00files/upload-dir/writing.txt");
      writer.write("this is first line.\nthis is second line.");
      writer.close();

      System.out.println("Done");
    } catch (IOException e) {
      System.out.println("error!");
      e.printStackTrace();
    } 
  }
}
