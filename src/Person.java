public class Person {
    //firstName, lastName, age e address, i getter and i setter
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    public Person(Builder builder) {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age=builder.age;
        this.address= builder.address;
    }

    public String getfirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public int getAge() {
        return age;
    }



    public String getAddress() {
        return address;
    }





    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
