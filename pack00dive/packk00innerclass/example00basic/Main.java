package pack00dive.packk00innerclass.example00basic;

public class Main {
  public static void main(String[] args) {

    Oreo oreo = new Oreo();

    Oreo.Cream cream = oreo.new Cream();

    System.out.println(oreo.o + cream.c); 
  }
}
