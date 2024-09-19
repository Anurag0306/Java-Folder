import java.util.Scanner;
class Person {

    private String name;
    private int age;

    public void setValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getValue() {
        System.out.println("The name of the person is "+ name + " and the age is "+ age +".");
    }
}
class Problem2 {

    public static void main (String args[]) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        person.setValue(name, age);     
        person.getValue();
}
}