import java.awt.event.ItemEvent;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите телефон: ");
        String tel = new Scanner(System.in).nextLine();
        System.out.println(formatPhone(tel));

    }

    public static String formatPhone(String tel) {
        String regex = "[^0-9]";
        String phone = tel.replaceAll(regex, "");
        if (phone.length() > 11 || phone.length() < 10 || phone.startsWith("9")) {
            String s = "Введен неверный формат";
            return s;
        }
        if (phone.length() == 11) {

            if (phone.startsWith("8")) {
                tel = tel.replaceFirst("8", "7");
            }
        }
            return tel.replaceAll(regex, "");
        }
    }
