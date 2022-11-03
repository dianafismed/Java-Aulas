public class Account {
  
  private static final Integer PATTERN_AGENCY = 0001;
  private static Integer SEQUENCIAL = 1;
  
  
  protected Integer agency;
  protected Integer number;
  //protected Client client;
  protected Double balance = 0.0;

 
  public Account() {
    this.agency = PATTERN_AGENCY;
    this.number = SEQUENCIAL++;
    //this.client = client;
  }

  public Integer getAgency() {
    return agency;
  }

  public Integer getNumber() {
    return number;
  }


  // public String getClient() {
  //   return getClient();
  // }

  // public void setCliente(Client client) {
  //   this.client = client;
  // }

  public Double getBalance() {
    return balance;
  }

  public void withdraw(Double value){
    if(balance>value) balance -= value;
    else System.out.println("Saldo Insuficiente");
  }

  public void deposit(Double value){
    balance += value;
  }

  public void transfer(Double value, Account destinyAccount){
    this.withdraw(value);
    destinyAccount.deposit(value);
  }

  public void printAccountStatement() {
  }

  protected void commonData(){
    System.out.println(String.format("Agência  :\t%d", agency));
    System.out.println(String.format("Número   :\t%d", number));
    System.out.println(String.format("Saldo(R$):\t%.2f", balance));
  }

}
