import java.util.Scanner;

public class Main {
    private static final String VALID_STRING = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";

    public static void main(String[] args) {

        inputFio();
    }

        public static void inputFio () {
            boolean isValid = true;
            int spaceCount = 0;

            System.out.println("Введите свое ФИО");
            String inputFio = new Scanner(System.in).nextLine().trim();

            for (int i = 0; i < inputFio.length(); i++) {
                if (!VALID_STRING.contains(String.valueOf(inputFio.charAt(i)))) {
                    isValid = false;
                    break;
                }
                if (inputFio.charAt(i) == ' ') {
                    spaceCount++;
                }
            }

            if (isValid && spaceCount == 2) {
                System.out.println("Фамилия: " + inputFio.substring(0, inputFio.indexOf(" ")));
                System.out.println("Имя: " + inputFio.substring(inputFio.indexOf(" "), inputFio.lastIndexOf(" ")));
                System.out.println("Отчество:" + inputFio.substring(inputFio.lastIndexOf(" "), inputFio.length()));
            } else {
                System.out.println("Введенная строка не является ФИО");
        }
    }
}