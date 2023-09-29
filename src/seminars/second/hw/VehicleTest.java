package seminars.second.hw;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class VehicleTest {
    /*       b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре)) */
    @Test
    public void testCar() {
        // Создаем объект класса Car
        Car car1 = new Car("Toyota", "Corolla", 2020);

        // Проверяем поля и методы класса Car
        assertThat(car1.getCompany()).isEqualTo("Toyota");
        assertThat(car1.getModel()).isEqualTo("Corolla");
        assertThat(car1.getYearRelease()).isEqualTo(2020);
        assertThat(car1.getNumWheels()).isEqualTo(4);
        assertThat(car1.getSpeed()).isEqualTo(0);
        car1.testDrive();
        assertThat(car1.getSpeed()).isEqualTo(60);
        car1.park();
        assertThat(car1.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcycle() {
        // Создаем объект класса Motorcycle
        Motorcycle moto1 = new Motorcycle("Honda", "CBR", 2019);

        // Проверяем поля и методы класса Motorcycle
        assertThat(moto1.getCompany()).isEqualTo("Honda");
        assertThat(moto1.getModel()).isEqualTo("CBR");
        assertThat(moto1.getYearRelease()).isEqualTo(2019);
        assertThat(moto1.getNumWheels()).isEqualTo(2);
        assertThat(moto1.getSpeed()).isEqualTo(0);
        moto1.testDrive();
        assertThat(moto1.getSpeed()).isEqualTo(75);
        moto1.park();
        assertThat(moto1.getSpeed()).isEqualTo(0);
    }

    /*         c). Написать следующие тесты:
                 - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
                 - проверка того, объект Car создается с 4-мя колесами
                 - проверка того, объект Motorcycle создается с 2-мя колесами
                 - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
                 - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
                 - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
                 - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
        */
    @Test
    public void testCar1() {
        // Создаем объект класса Car
        Car car1 = new Car("Toyota", "Corolla", 2020);

        // Проверяем поля и методы класса Car
        assertThat(car1.getCompany()).isEqualTo("Toyota");
        assertThat(car1.getModel()).isEqualTo("Corolla");
        assertThat(car1.getYearRelease()).isEqualTo(2020);
        assertThat(car1.getNumWheels()).isEqualTo(4);
        assertThat(car1.getSpeed()).isEqualTo(0);
        car1.testDrive();
        assertThat(car1.getSpeed()).isEqualTo(60);
        car1.park();
        assertThat(car1.getSpeed()).isEqualTo(0);

        // Проверяем, что экземпляр объекта Car также является экземпляром транспортного средства
        assertThat(car1).isInstanceOf(Vehicle.class);
    }

    @Test
    public void testMotorcycle1() {
        // Создаем объект класса Motorcycle
        Motorcycle moto1 = new Motorcycle("Honda", "CBR", 2019);

        // Проверяем поля и методы класса Motorcycle
        assertThat(moto1.getCompany()).isEqualTo("Honda");
        assertThat(moto1.getModel()).isEqualTo("CBR");
        assertThat(moto1.getYearRelease()).isEqualTo(2019);
        assertThat(moto1.getNumWheels()).isEqualTo(2);
        assertThat(moto1.getSpeed()).isEqualTo(0);
        moto1.testDrive();
        assertThat(moto1.getSpeed()).isEqualTo(75);
        moto1.park();
        assertThat(moto1.getSpeed()).isEqualTo(0);

        // Проверяем, что экземпляр объекта Motorcycle также является экземпляром транспортного средства
        assertThat(moto1).isInstanceOf(Vehicle.class);
    }
}