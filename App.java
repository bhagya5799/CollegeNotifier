// Demonstrating OOP (Encapsulation + Inheritance)
class User {
    protected String name;
    protected String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }
}

class Student extends User {
    public Student(String name, String srn) {
        super(name, srn);
    }
}

class Admin extends User {
    public Admin(String name, String adminId) {
        super(name, adminId);
    }

    public void postEvent(String event) {
        System.out.println("New Event Posted: " + event);
    }
}

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("HOD", "ADMIN001");
        admin.postEvent("Sports Day on Nov 10");

        Student s = new Student("Bhagya", "SRN123");
        System.out.println(s.getName() + " can view: Sports Day on Nov 10");
    }
}
