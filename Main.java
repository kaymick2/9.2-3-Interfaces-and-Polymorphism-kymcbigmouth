/**
   This program tests the DataSet class.
*/
public class Main
{
   public static void main(String[] args)
   {
      DataSet bankData = new DataSet();

      bankData.add(new BankAccount(0));
      bankData.add(new BankAccount(20000));
      bankData.add(new BankAccount(4000));

      System.out.println("Average balance: " + bankData.getAverage());
      System.out.println("Expected: 8000");
      Measurable max = bankData.getMaximum();
      System.out.println("Highest balance: " + max.getMeasure());
      System.out.println("Expected: 20000");

      DataSet coinData = new DataSet();

      coinData.add(new Coin(0.3, "quarter"));
      coinData.add(new Coin(0.2, "dime"));
      coinData.add(new Coin(0.1, "nickel"));

      System.out.println("Average coin value: " + coinData.getAverage());
      System.out.println("Expected: 0.199");            
      max = coinData.getMaximum();
      System.out.println("Highest coin value: " + max.getMeasure());
      System.out.println("Expected: 0.3");            
   }
}
