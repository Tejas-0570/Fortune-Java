/*
1. Input  : Vaibhav
   Output : vaibhaV

2. Input  : "I Love my India" (Count the number of character without using in-build methods)
   Output : 15

3. Input  : "Vaibhav"
   Output :  Duplicate Characters

4. Input  : "I Love my India" (Count the number of spaces)
   Output : 3

5. Input  : "I Love my India" (Count the number of vowels)
   Output : 6
 */


class Homework{
    public static void main(String[] args) {

//        ---------------------- First ----------------------
        System.out.println("--------------------------------------------------------");
        String name = "Vaibhav";
        System.out.println("Origin String   : "+name);
        char firstChar = Character.toLowerCase(name.charAt(0));
        String middle = name.substring(1, name.length()-1);
        char lastChar = Character.toUpperCase(name.charAt(name.length()-1));
        System.out.println("Modified String : "+firstChar+middle+lastChar);
        System.out.println("--------------------------------------------------------");


//        ---------------------- Second ----------------------
        String str = "I Love my India";
        int charCnt = 0;
        for(char c : str.toCharArray()){
            charCnt++;
        }
        System.out.println("Input    : I Love my India");
        System.out.println("Character count : "+charCnt);
        System.out.println("--------------------------------------------------------");


//        ---------------------- Third ----------------------
        String input = "programmingr";
        int len = input.length();
        boolean[] visited = new boolean[len];
        System.out.println("Duplicate character and there indices in '"+input+"' : ");
        for(int i = 0; i < len; i++){
            if(visited[i]){
                continue;
            }
            char ch = input.charAt(i);
            int cnt = 1;

            for(int j = i+1; j < len; j++){
                if(ch == input.charAt(j)){
                    cnt++;
                }
            }

            if(cnt > 1){
                int[] indices = new int[cnt];
                int indexPosition = 0;
                for(int j = i; j < len; j++){
                    if(input.charAt(j) == ch){
                        indices[indexPosition++] = j;
                        visited[j] = true;
                    }
                }
                System.out.print("Character '"+ch+"' appears "+cnt+" times at indices [");
                for(int k = 0; k < indices.length; k++){
                    System.out.print(indices[k]);
                    if(k < indices.length-1){
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
        System.out.println("--------------------------------------------------------");


//        ---------------------- Fourth ----------------------
        String str1 = "I Love my India";
        int spaceCnt = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == ' '){
                spaceCnt++;
            }
        }
        System.out.println("Input    : I Love my India");
        System.out.println("Space Count : "+spaceCnt);
        System.out.println("--------------------------------------------------------");



//        ---------------------- Fifth ----------------------
        String st = "I Love my India";
        int vowelCnt = 0;
        String str2 = st.toLowerCase();
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u'){
                vowelCnt++;
            }
        }
        System.out.println("Input    : I Love my India");
        System.out.println("Vowel Count : "+vowelCnt);
        System.out.println("--------------------------------------------------------");

    }

}