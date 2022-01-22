package jung;
public class Teacher {
// Teacher
// - id (String) 
// - name (String)
// - subject object (Subject) 
// - address (String)
// + Teacher(String id, String name, Subject subject, String address) -> constructor
// + getter and setter
// + toString
    private String id;
    private String name;
    private String address;
    private Subject subject;

    public Teacher(String id, String name, String address, Subject subject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.subject = subject;
    }

    public String toString() {
        String result = "";
        result += "ID: " + id + "\n";
        result += "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Subject: " + subject + "\n";
        return result;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

}
