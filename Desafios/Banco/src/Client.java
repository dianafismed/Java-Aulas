public class Client {

  private static Integer SEQUENCIAL = 1;
  
  protected Integer id;
  protected String name;
  protected Account account;


  public Client(String name, Account account) {
    this.id = SEQUENCIAL++;
    this.name = name;
    this.account = account;
  }


  public Integer getId() {
    return id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    this.account = account;
  }

}
