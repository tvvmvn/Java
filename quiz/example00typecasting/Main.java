package quiz.example00typecasting;

public class Main {
  public static void main(String[] args) {
    
    int maxScore = 500;

    int userScore = 423;

    float percentage = (float) userScore / maxScore * 100.0f;

    System.out.println("User's percentage is " + percentage);
  }
}
