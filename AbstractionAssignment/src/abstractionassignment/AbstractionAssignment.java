package abstractionassignment;

public class AbstractionAssignment {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.describe();

        BankAccount bank = new SavingsAccount();
        bank.describe();

        Animal animal = new Dog();
        animal.describe();

        Employee employee = new Manager();
        employee.describe();

        Shape shape = new Circle();
        shape.describe();

        Hospital hospital = new Doctor();
        hospital.describe();

        SchoolMember school = new Student();
        school.describe();

        Payment payment = new CreditCardPayment();
        payment.describe();

        Appliance appliance = new Fan();
        appliance.describe();

        Product product = new BookProduct();
        product.describe();

    }

}