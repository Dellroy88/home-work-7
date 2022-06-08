public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firsName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firsName + middleName;
        // Задание 2
        fullName = fullName.toUpperCase();
        // Задание 3
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("fullName = " + fullName);

    }
}