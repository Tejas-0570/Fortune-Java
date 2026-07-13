import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("------------------ Enter "+size+" elements in array ------------------");
        for(int i = 0; i < size ; i++){
            System.out.print("Enter element at index "+i+" : ");
            array[i] = sc.nextInt();
        }
        System.out.println("\n------------------- Array Elements -------------------");
        System.out.print("Array = { ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("}");
    }
}
