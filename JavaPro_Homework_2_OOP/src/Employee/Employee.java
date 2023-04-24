package Employee;

public class Employee {

    private String fullName;
    private String email;
    private String phoneNum;
    private int age;


    public Employee() {
        this.fullName = getFullName();
        this.email = getEmail();
        this.phoneNum = getPhoneNum();
        this.age = getAge();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
