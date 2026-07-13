import java.lang.String;
class  JavaString{
    public static void main(String[] args) {
        String s1 = "Tejas";
        String s2 = "Tejas";
        String s3 = new String("Tejas");
        System.out.println(s1 == s2); // true (checks only reference)
        System.out.println(s1 == s3); // false (checks only reference)
        System.out.println(s1.equals(s3));  // true (checks value)

        System.out.print(s1+" "+s2+" "+s3);
    }
}