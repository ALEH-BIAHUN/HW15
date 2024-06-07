public class Main {

    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!

    public static final String RUSSIAN_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static void main(String[] args) {

    printingTheCodesOfTheRussianAlphabet();

    }
    public static void printingTheCodesOfTheRussianAlphabet() {
        for (int i = 0; i < RUSSIAN_ALPHABET.length(); i++) {
            char ch = RUSSIAN_ALPHABET.charAt(i);
            int charCode = (int) ch;
            System.out.print(ch + "-" + charCode + "\n");
        }
    }
}