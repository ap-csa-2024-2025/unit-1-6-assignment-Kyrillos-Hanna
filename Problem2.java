public class Problem2
{
  public static void main(String[] args)
  {
    double num1 = 0.79859438;
    num1+=0.5;
    int roundedNum1 = (int) num1;
    double num2 = 2.37859739487;
    num2+=0.5;
    int roundedNum2 = (int) num2;

    int x = roundedNum1 + roundedNum2;

    System.out.println("Original Numbers " + num1 + "  " + num2);
    System.out.println("Sum: " + roundedNum1 + " + " + roundedNum2 + " = " + x);
  }
}

