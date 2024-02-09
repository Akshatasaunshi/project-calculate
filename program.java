import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, String dateOfBirth) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if (dateOfBirth.contains("-")) {
            this.dateOfBirth = dateFormat.parse(dateOfBirth);
        } else {
            dateFormat.applyPattern("yyyy-MM-dd");
            this.dateOfBirth = dateFormat.parse(dateOfBirth);
        }
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
        long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Student Age: " + ageInYears + " years");
    }

    public static void main(String[] args) throws ParseException {
        // Example usage:
        Student student1 = new Student("John Doe", "1998-05-15");
        student1.displayName();
        student1.displayAge();
    }
}

