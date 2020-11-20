public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("José", "R. Bolinha, 1234");
        System.out.println(p);
        p.setAddress("R. Quadrado, 312");
        System.out.println(p);
    }
}
