public class Problem3
{
  public static void main(String[] args)
  {
    double decimal = 5875.14858359;
    int num = (int) decimal;
    decimal-=num;
    decimal*=1000;
    int number = (int) decimal;

    int firstNum = number % 10;
    number/=10;
    int secondNum = number % 10;
    number/=10;
    int thirdNum = number % 10;
    
    System.out.println(thirdNum);

    System.out.println(secondNum);

    System.out.println(firstNum);
    
  }
}

