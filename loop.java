import java.util.Scanner;
class loop{
    public static void main(String[] args){
        int choice, balance = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a option: 1 withdraw, 2 add, 3 check balance:");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                //withdraw();
                //checkBalance();
                break;
            case 2 :
                //add();
                //checkBalance();
                break;
            case 3:
                //checkBalance();
                break;
            default:
                System.out.println("enter a valid choice");
                break;
        }
        
    }
}
