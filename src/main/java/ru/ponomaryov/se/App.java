package ru.ponomaryov.se;

/**
 * @author Oleg Ponomaryov
 * @version 1.0.0
 */
public class App {
    public static void main(String[] args) {
        Staffer[] staffArray = new Staffer[5];
        staffArray[0] = new Staffer("Иванов Иван Иванович", "Дворник", "iivanov@mailbox.com", "89654135598", 20000.0D, 47);
        staffArray[1] = new Staffer("Петров Александр Вячеславович", "Начальник отдела", "avpetrov@mailbox.com", "89026548715", 90000.0D, 34);
        staffArray[2] = new Staffer("Кудесник Михаил Артемович", "Старший конструктор", "makudesnik@mailbox.com", "89185871465", 75000.0D, 42);
        staffArray[3] = new Staffer("Кузюкова Вера Владимировна", "Конструктор", "vvkuzukova@mailbox.com", "89209845612", 62000.0D, 37);
        staffArray[4] = new Staffer("Мухин Алексей Иванович", "Бухгалтер", "aimuhin@mailbox.com", "89445686872", 69000.0D, 44);
        for (int i = 0; i < 5; i++) {
            if (staffArray[i].getStaffAge() > 40) {
                staffArray[i].printStafferInfo();
            }
        }
    }
}
