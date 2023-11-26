public class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Builder(String lastName,String firstName) {
    this.lastName=lastName;
    this.firstName=firstName;
    }

    public Builder setfirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setlastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public Person build(){
        return new Person(firstName,lastName,age,address);
    }
}
