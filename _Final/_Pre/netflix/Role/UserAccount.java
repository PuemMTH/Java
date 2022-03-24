package Role;

public class UserAccount {
    int age;
    String email;
    String name;
    String phone;

    public UserAccount(int age, String email, String name, String phone) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
