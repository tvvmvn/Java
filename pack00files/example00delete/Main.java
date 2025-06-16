package pack00files.example00delete;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    File f = new File("/Users/jintaemin/lecture/Java/pack00files/upload-dir/deleting.txt");

    if (f.delete()) {
      System.out.println("Deleted file: " + f.getName());
    } else {
      System.out.println("Failed to delete");
    }
  }
}
