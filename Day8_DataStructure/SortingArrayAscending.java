import java.util.Scanner;
class SortingArrayAscending{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index "+i+" : ");
            array[i] = sc.nextInt();
        }

        // 41 5 66 23 33

        for(int i = 0; i < size; i++){
            int temp = 0;
            for(int j = i+1; j < size; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("\n------------------- Array Elements -------------------");
        System.out.print("Array = { ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("}");
    }
}