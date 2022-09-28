public class Main {
    public static void main(String[] args) {
        System.out.println("   Задача 1.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("   Задача 2.");
        String s = fullName;
        String s1 = s.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);

        System.out.println("   Задача 3.");
        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1 = "Семёнов";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
        String s2 = fullName1;
        String s3 = s2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + s3);

    }
}