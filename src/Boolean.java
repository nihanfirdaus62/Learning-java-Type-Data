import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        boolean TrueFalse;
        Scanner scan = new Scanner(System.in);

        System.out.println("boolean Generator!");
        System.out.println("Do you want boolean True or False?(T/F)");
        String yn =scan.next().toLowerCase();
        if(yn.equals("t")){
            TrueFalse=true;
            System.out.println(TrueFalse);
        } else if (yn.equals("f")) {
            TrueFalse=false;
            System.out.println(TrueFalse);
        } else {
            System.out.println("Only T/F!");
        }
        System.out.println("Program End!");
    }
}
