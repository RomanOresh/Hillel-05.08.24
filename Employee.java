public class Employee {
    private String fullName;
    private String rank;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(String fullName, String rank, String email, int phoneNumber, int age) {
        this.fullName = fullName;
        this.rank = rank;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

     public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}


