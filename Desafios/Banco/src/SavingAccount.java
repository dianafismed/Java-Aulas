public class SavingAccount extends Account{
  
  public void printAccountStatement(){
    System.out.println("\tEXTRATO\t");
    System.out.println("\tCONTA POUPANCA\t");

    super.commonData();
    System.out.println("\n\n");
  } 
}
