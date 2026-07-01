import java.util.Scanner;
class ControlFlowStatement{
    static double currBalance;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int traAgain;
        do{
            System.out.println("\n-------------------- Welcome To ATM --------------------------");
            for(int i = 2; i >= 0;i--){
                System.out.print("Enter your pin : ");
                int pin = sc.nextInt();
                if(pin == 1234){
                    while (true){
                        System.out.println("\n1.Withdraw \n2.Deposite \n3.Check Balance \n4.Exit");
                        System.out.print("\nEnter your choice (e.g. Enter 2 for Withdraw): ");
                        int choice = sc.nextInt();
                        switch (choice){
                            case 1:
                                System.out.print("Please Enter amount for withdraw : ");
                                int withAmt = sc.nextInt();
                                if(withAmt <= currBalance){
                                    currBalance -= withAmt;
                                    System.out.println("Amount is withdrawed successfully!");
                                } else {
                                    System.out.println("Insufficent Balance");
                                }
                                System.out.println("----------------------------------------------------------");
                                break;

                            case 2:
                                System.out.print("Please Enter amount for deposite : ");
                                int depoAmt = sc.nextInt();
                                currBalance += depoAmt;
                                System.out.println("Amount is deposited successfully!");
                                System.out.println("----------------------------------------------------------");
                                break;

                            case 3:
                                System.out.println("\nAvailable Balance : "+currBalance);
                                System.out.println("----------------------------------------------------------");
                                break;

                            case 4:
                                System.out.println("Thank you for visiting");
                                return;

                            default:
                                System.out.println("Invalid Choice!");
                                System.out.println("----------------------------------------------------------");
                                break;
                        }
                    }
                }
                else {
                    System.out.println("Invalid Pin! "+i+" Attempts left");
                    if(i == 0){
                        System.out.println("\nSorry! 0 Attempts left! Try Again");
                        break;
                    }
                }

            }
            System.out.print("Want to try again, please enter 1 for Yes otherwise 0 for No : ");
            traAgain = sc.nextInt();
        } while(traAgain == 1);

    }
}
