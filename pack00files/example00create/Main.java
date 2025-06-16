package pack00files.example00create;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) {
    try {
      File f = new File("/Users/jintaemin/lecture/Java/pack00files/upload-dir/creating.txt");

      if (f.createNewFile()) {
        System.out.println("Created files: " + f.getName());
      } else {
        System.out.println("File already exists");
      }
    } catch (IOException e) {
      System.out.println("error!");
      e.printStackTrace();
    }
  }
}
