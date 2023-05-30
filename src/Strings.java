import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String name;
        char chara;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your name : ");
        name = scan.nextLine();
        System.out.print("Input your gender :  " );
        chara = scan.nextLine().charAt(0);
        System.out.println("your name is " + name);
        System.out.println("your gender is " + chara);



    }
}
