package Practicals;

public class Student extends Person {
    //private final String setName;
    //private final String setAddress;
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address){
        setName(name);
        setAddress(address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }


    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        String s = "Student[Person name=" + this.getName() + ",address=" + this.getAddress() + "], program=" + getProgram() + ",year=" + getYear() + " ,fee=" + getFee();
        return s;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}


