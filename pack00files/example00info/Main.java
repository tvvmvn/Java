package pack00files.example00info;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    File f = new File("/Users/jintaemin/lecture/Java/pack00files/upload-dir/writing.txt");

    if (f.exists()) {
      System.out.println("<File info>");
      System.out.println("File name: " + f.getName());
      System.out.println("Absolute path: " + f.getAbsolutePath());
      System.out.println("Writable: " + f.canWrite());
      System.out.println("Readable: " + f.canRead());
      System.out.println("File size in bytes: " + f.length());
    } else {
      System.out.println("File not exists");
    }
  }
}
