import java.util.Scanner;
public class String_Reverse {
    public static void main(String[]args){

        Scanner str=new Scanner(System.in);
        System.out.println("Enter a string");
        String Rev=str.nextLine();
        String result=" ";
        int i;
        for(i=Rev.length()-1;i>=0;i--)
            result+=Rev.charAt(i);
        System.out.println("the reversed string is"+ result);
    }

}
