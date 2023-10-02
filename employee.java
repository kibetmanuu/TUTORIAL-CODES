public class employee {
    private String name;
    private String address;
    private int number;
    private int ssn;
    private double salary;

    public static void main(String[] args) {
        employee e1, e2;
        e1 = new employee();
        e2 = new employee();

        e1.setName("Robert Smith");
        e1.setAddress("123 Main St., Anytown, USA");
        e1.setNumber(101);
        e1.setSsn(11122333);
        e1.setSalary(10000.00);

        System.out.println(e1.computePay());
        e1.mailCheck();

        e2.setName("Jane Smith");
        e2.setAddress("321 Main St., Anytown, USA");
        e2.setNumber(202);
        e2.setSsn(11122333);
        e2.setSalary(10000.00);

        System.out.println(e2.getName() + " " + e2.getSsn());

        System.out.println(e1.computePay());
        e1.mailCheck();
    }

    // Getter and Setter methods for instance variables
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Other methods like computePay and mailCheck
    public double computePay() {
        // Calculate the pay based on some logic
        return salary;
    }

    public void mailCheck() {
        // Implement mailCheck logic
        System.out.println("Mailing a check to " + name + " at " + address);
    }
}
