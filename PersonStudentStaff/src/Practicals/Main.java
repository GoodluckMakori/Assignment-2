package Practicals;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Goodluck Makori");
        person.setAddress("Dar es salaam");
        System.out.println(person.toString());

        //student
        Student student=new Student("Emmy","Poland");
        student.setFee(1100000);
        student.setYear(1);
        student.setProgram("ISM");

        //FOR STAFFF
        Staff staff=new Staff("Bills Goodluck","Dodoma","SEST",2500000);
        staff.setPay(3000000);
        staff.setSchool("SERBI");
        System.out.println(staff.toString());



    }
}
