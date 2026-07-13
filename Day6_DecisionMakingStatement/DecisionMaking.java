import java.util.Scanner;
class DecisionMaking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      -------------------- if-else -----------------------
        System.out.print("Enter a Username : ");
        String username = sc.next();
        System.out.print("Enter a password : ");
        String pass = sc.next();
        if(username.equals("tejas") && pass.equals("tejas123")){
            System.out.println("Login Successfull!");
        } else {
            System.out.println("Login Failed!");
        }

//      -------------------- else-if ladder -----------------------
        System.out.print("\n1.Admin \n2.Student \n3.Manager \n4.Trainer");
        System.out.print("\nEnter your role (e.g. Enter 1 for Admin) : ");
        int role = sc.nextInt();
        if (role == 1){
            System.out.println("Welcome Admin!!!");
        } else if (role == 2) {
            System.out.println("Welcome Student");
        } else if (role == 3) {
            System.out.println("Welcome Manager");
        } else if (role == 4) {
            System.out.println("Welcome Trainer");
        } else {
            System.out.println("Invalid Role!!!");
        }

//      -------------------- switch -----------------------
        System.out.println("\nWelcome to our Restaurant");
        System.out.println("1.Sandwitch \n2.Burger \n3.Pizza \n4.Colf Coffee");
        System.out.print("Please enter your choice (e.g. Enter 3 for Pizza): ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Nice! You have ordered Sandwitch");
                break;
            case 2:
                System.out.println("Excellent Choice! You have ordered Burger");
                break;
            case 3:
                System.out.println("Fabulous! You have ordered pizza");
                break;
            case 4:
                System.out.println("Great! You have ordered Cold Coffee");
                break;
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }


    }
}