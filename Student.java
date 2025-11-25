public class Student {
    private String name;
    private String phone;  // Person B lägger till phone
    private String testName;

    public Student(String name, String phone, String testName) {
        this.name = name;
        this.phone = phone;
        this.testName = testName;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
