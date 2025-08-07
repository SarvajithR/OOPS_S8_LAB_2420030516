package MyPack;
import java.util.Scanner;
public class alphabetcheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Valid alphabetic character");
        } else {
            System.out.println("Not an alphabetic character");
        }

        scanner.close();
	}

}
