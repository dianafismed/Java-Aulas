import java.util.Scanner;

public class App {
    public static void main(String[] args) {        
        Menu();
    }

    private static void Menu() {
        Integer stop = 0;
        while (stop != 0){
            Runtime.getRuntime().exec("cls");
            System.out.println("Novo \n"+
                "1 - Conta corrente\n" +
                "2 - Conta poupança\n\n" +
                "Movimentação\n" +
                "3 - Saque\n" +
                "4 - Depósito\n\n" +
                "Transferências\n" +
                "5 - Entre contas\n" +
                "6 - TED\n" +
                "Extratos\n" +
                "7 - Conta corrente\n" +
                "8 - Poupança\n\n" +
                "Lista de contas" +
                "9 - Lista de contas\n\n" +
                "0 - Sair");              
            Scanner scanner = new Scanner(System.in);
            stop = scanner.nextInt();
            switch (stop){
                case 0: break;
                case 1: NewCheckingAccount(); break;
                case 2: NewSavingAccount(); break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: break;
                default: System.out.println("Digite uma opção válida"); Menu(); break;
            }
        }
    }

    private static void NewCheckingAccount(){
        Account account = new Account();
        NewClient(account);   
        
    }

    private static void NewSavingAccount(){
        Account account = new Account();
        NewClient(account);
    }

    private static Client NewClient(Account account){
        System.out.println("Digite o nome do cliente: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Client c = new Client(name, account);
        
        return c;
    }

}


// Account cc1 = new CheckingAccount();
        // cc1.printAccountStatement();
        // cc1.deposit(10000.0);
        // cc1.withdraw(100.00);
        // cc1.printAccountStatement();


        // Account cp1 = new SavingAccount();
        // cp1.deposit(1300.00);
        // cp1.printAccountStatement();

        // cc1.transfer(5.0,cp1);
        // cc1.printAccountStatement();
        // cp1.printAccountStatement();
        //List list = new ArrayList();