/*
Input : 12 42 53 64 18

First Output  : 64 53 42 18 12
Second Output : 46 35 24 81 21
Third Output  : 2  2  2  7  1 (Difference)
Fourth Output : 10 8  6  9  3   (Addition)
Fifth Output  : Dispaly value of even index only
 */

class LogicBuildingExamples{
    public static void main(String[] args) {
//---------------------------- First Output ----------------------------
        int[] Input = {12, 42, 53, 64, 18};
        System.out.print("Input Array   : ");
        for(int i = 0; i < Input.length; i++){
            System.out.print(Input[i]+" ");
        }
//---------------------------- First Output ----------------------------
        for(int i = 0; i < Input.length; i++){
            int temp = 0;
            for(int j = i+1; j < Input.length; j++){
                if(Input[i] < Input[j]){
                    temp = Input[i];
                    Input[i] = Input[j];
                    Input[j] = temp;
                }
            }

        }
        System.out.print("\nFirst Output  : ");
        for(int i = 0; i < Input.length; i++){
            System.out.print(Input[i]+" ");
        }
//---------------------------- Second Output ----------------------------
        for(int i = 0; i < Input.length; i++){
            int element = Input[i];
            int rev = 0;
            while(element != 0){
                rev = rev * 10 + (element % 10);
                element /= 10;
            }
            Input[i] = rev;
        }
        System.out.print("\nSecond Output : ");
        for(int i = 0; i < Input.length; i++){
            System.out.print(Input[i]+" ");
        }
//---------------------------- Third Output ----------------------------
        int[] Third = new int[5];
        for(int i = 0; i < Input.length; i++){
            int element = Input[i];
            int first = element/10;
            int second = element%10;
            if(first > second){
                Third[i] = (first-second);
            } else {
                Third[i] = (second-first);
            }
        }
        System.out.print("\nThird Output  : ");
        for(int i = 0; i < Third.length; i++){
            System.out.print(Third[i]+" ");
        }

//---------------------------- Fourth Output ----------------------------
        int[] Fourth = new int[5];
        for(int i = 0; i < Input.length; i++){
            int element = Input[i];
            Fourth[i] = (element/10) + (element%10);
        }
        System.out.print("\nFourth Output : ");
        for(int i = 0; i < Fourth.length; i++){
            System.out.print(Fourth[i]+" ");
        }

//---------------------------- Fifth Output ----------------------------
        System.out.print("\nFifth Output  : ");
        for(int i = 0; i < Input.length; i++){
            if(i % 2 == 0){
                System.out.print(Input[i]+" ");
            }
        }

    }
}