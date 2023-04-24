package Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setFullName("John");
        employee.setPhoneNum("+123456789");
        employee.setAge(25);
        employee.setEmail("john@email.com");

        System.out.println("Employee details: \nName: " + employee.getFullName() +
                "\nPhone Number: " + employee.getPhoneNum() +
                "\nAge: " + employee.getAge() +
                "\nEmail: " + employee.getEmail());
    }

}
