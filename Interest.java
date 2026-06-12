import java.util.*;
public class Interest{
  public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    double p=sc.nextDouble();
    double r=sc.nextDouble();
    double t=sc.nextDouble();
    double si=(p*r*t)/100;
    System.out.print(si);
  }
}
