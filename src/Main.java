public class Main {
    public static void main(String[] args) {

        System.out.println("Для задач 1 и 2 выделена отдельная область видимости переменных");{
        System.out.println("Задача № 1");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф.И.О. сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задача № 2");
        System.out.println();

        String fullNameUpper = fullName.toUpperCase();

        System.out.println("Ф.И.О. сотрудника — " + fullNameUpper);
        System.out.println();
        }

        System.out.println("Задача № 3");
        System.out.println();

        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace('ё', 'е');

        System.out.println("Данные Ф.И.О. сотрудника — " + fixedFullName);
    }
}