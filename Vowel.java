import java.util.Scanner;
public class Vowel {
    public static void main(String[]args)
    {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char al=myObj.next().charAt(0);
        if(al =='a'||al=='e'||al=='i'||al=='o'||al=='u'|al =='A'||al=='E'||al=='I'||al=='O'||al=='U')
            System.out.println("is vowel");
        else {
            System.out.println("is Consonant");
        }
    }
}