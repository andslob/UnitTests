package seminars.second.hw;

public class Main {
    public static void main(String[] args) {

    /*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         a). Нужно создать новый проект, с представленной структурой классов */
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Motorcycle moto1 = new Motorcycle("Honda", "CBR", 2019);

        // Выводим информацию о них
        System.out.println(car1);
        System.out.println(moto1);

        // Проверяем методы testDrive и park
        car1.testDrive();
        moto1.testDrive();
        System.out.println("The speed of the car is " + car1.getSpeed() + " km/h");
        System.out.println("The speed of the motorcycle is " + moto1.getSpeed() + " km/h");
        car1.park();
        moto1.park();
        System.out.println("The speed of the car is " + car1.getSpeed() + " km/h");
        System.out.println("The speed of the motorcycle is " + moto1.getSpeed() + " km/h");

/*       b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре)) */

/*         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    */

    }
}