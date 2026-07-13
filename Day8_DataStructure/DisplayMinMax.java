import java.util.Scanner;
class DisplayMinMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index "+i+" : ");
            array[i] = sc.nextInt();
        }
        int min = array[0], max = array[0];
        for (int i = 1; i < size; i++){
            if(array[i] < min){
                min = array[i];
            } else if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
    }
}