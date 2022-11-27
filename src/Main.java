public class Main {


    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println();

        // Задание 1

        Author herbertSchildt = new Author("Герберт", "Шилдт");
        Author PaulDaugherty = new Author("Пол", "Доэрти");
        Book javaLight = new Book("Java Руководство для начинающих", herbertSchildt, 2019);
        Book javaFull = new Book("Java Полное руководство", herbertSchildt, 2018);
        Book humanMachine = new Book("Человек + машина", PaulDaugherty, 2019);
        System.out.println(javaLight.getName()+" "+javaLight.getYear()+ " " +javaLight.getAuthor());
        System.out.println(javaFull.getName()+" "+javaFull.getYear()+ " " +javaFull.getAuthor());
        System.out.println(humanMachine.getName()+" "+humanMachine.getYear()+ " " +humanMachine.getAuthor());
        System.out.println();
        System.out.println("Вышло новое издание книги"); // Изменение параметра объекта
        javaLight.setYear(2021);
        System.out.println(javaLight.getName()+" "+javaLight.getYear()+ " " +javaLight.getAuthor());

        System.out.println();
        System.out.println("Сравнение объектов первой и последней книг");
        herbertSchildt.equals(PaulDaugherty);
        if (herbertSchildt.equals(PaulDaugherty)) {
            System.out.println("Авторы книг одинаковые");
        } else {
            System.out.println("Авторы книг разные");
        }
        javaLight.equals(humanMachine);
        if (javaLight.equals(humanMachine)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }
    }
}