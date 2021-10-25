public class Main {
    public static void main(String[] args)
    {
        // 4. Создать массив из 5 сотрудников.

        Employee[] employees = {
                new Employee(
                        "Ivanov Ivan Ivanovich",
                        "Veterinarian",
                        "ivanoviv@gmail.com",
                        "89000000000",
                        35000,
                        27),
                new Employee(
                        "Morozov Yan Andreevich",
                        "Driver",
                        "morozovyan@mail.ru",
                        "89111111111",
                        60000,
                        48),
                new Employee(
                        "Sidorov Artem Sergeevich",
                        "Engineer",
                        "sidorovart@gmail.com",
                        "89222222222",
                        50000,
                        39),
                new Employee(
                        "Safonov Kirill Sergeevich",
                        "Designer",
                        "safonovkir@gmail.com",
                        "89333333333",
                        40000,
                        30),
                new Employee(
                        "Konstantinov Alexey Ivanovich",
                        "HoofTrimmer",
                        "konstalex@gmail.com",
                        "89444444444",
                        75000,
                        41)
        };

        // 5. С помощью цикла вывести информацию
        // только о сотрудниках старше 40 лет.

        int minAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
