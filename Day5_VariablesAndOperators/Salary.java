import java.util.Scanner;
class Salary{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter your Salary : ");
float salary = sc.nextInt();
if(salary > 5000){
salary = salary +(salary * 5)/100;
System.out.print("Salary is : "+salary);
} else{

System.out.println("Salary is : "+salary);
}
}

}