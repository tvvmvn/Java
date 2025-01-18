package pack00dive.pack00annotation.example00override;

public class Cat implements Animal {
  @Override
  public void sound() {
    System.out.println("meow");
  }
}
