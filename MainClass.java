import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    System.out.println("REGEX USER VALIDATION");
    Scanner sc= new Scanner(System.in);
    RegexFname validate = new RegexFname();
    System.out.println("Enter the first and last name:");
    String flname = sc.nextLine();
    validate.validateName(flname);

}
}
