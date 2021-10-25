
// 1. Создать класс "Сотрудник" с полями:
// ФИО,
// должность,
// email,
// телефон,
// зарплата,
// возраст.
public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int wages;
    int age;

    // 2. Конструктор класса должен
    // заполнять эти поля при создании объекта.
    Employee(String name,
             String position,
             String email,
             String phone,
             int wages,
             int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод,
    // который выводит информацию об объекте в консоль.
    void printInfo()
    {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + wages);
        System.out.println("Возраст: " + age);
    }


}
