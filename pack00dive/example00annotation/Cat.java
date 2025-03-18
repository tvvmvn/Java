package pack00dive.example00annotation;

public class Cat implements Animal {
  @Override
  public void sound() {
    System.out.println("meow");
  }
}
