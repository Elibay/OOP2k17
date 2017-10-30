package Problem2;

public class Instructor {
    private String email, department, fullName;
    public String toString () {
        return email + " " + department + " " + fullName;
    }
    public Instructor (String email, String department, String fullName) {
        this.email = email;
        this.department = department;
        this.fullName = fullName;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getemail() {
        return email;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass() || o == null)
            return false;
        Instructor t = (Instructor) o;
        if (!t.email.equals(email))
            return false;
        return true;
    }
}
