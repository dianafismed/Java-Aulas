public class CheckingAccount extends Account{

  public void printAccountStatement(){
    System.out.println("\tEXTRATO\t");
    System.out.println("\tCONTA CORRENTE\t");
    super.commonData();
    System.out.println("\n\n");
  } 

}
