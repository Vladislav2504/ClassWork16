import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите IP-адрес");
        Scanner scanner = new Scanner(System.in);
        String IP = scanner.nextLine();
        String regexp = "\\d[0-9]{1,3}.\\d[0-9]{1,3}.\\d[0-9]{1,3}.\\d[0-9]{1,3}";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(IP);
        if (matcher.matches()){
            System.out.println("IP валиден");
        } else {
            System.out.println("IP не валиден");
        }





    }
}