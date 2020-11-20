public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("José", "R. Bolinha, 1234");
        Staff s = new Staff("Estafeiro","Av. Beira Rio, 132","Catolica SC", 1500.00);
        Student stu = new Student("Joãozinho", "R. Triângulo, 590", "Eng. Software", 3, 1200.00);
        System.out.println(p);
        p.setAddress("R. Quadrado, 312");
        System.out.println(p);
        System.out.println(s);
        System.out.println(stu);
        s.setSchool("Univille");
        s.setPay(1600.00);
        stu.setProgram("Medicina");
        stu.setYear(1);
        stu.setAddress("R. Orleans, 196");
        stu.setFee(1500.00);
        System.out.println(s);
        System.out.println(stu);
    }
}
