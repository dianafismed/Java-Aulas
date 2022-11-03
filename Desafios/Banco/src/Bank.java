import java.util.ArrayList;
import java.util.List;

public class Bank {
  protected List list = new ArrayList();

  public Bank(List list) {
    this.list = list;
  }
  
  public List getList() {
    return list;
  }
  
  public void setList(List list) {
    this.list = list;
  }

  public void printAccounts(){
    System.out.println(list);
  } 

}


