public class Builder {
    public String firstName;
    public  String lastName;
    public  int age;
    public  String address;
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Builder(String lastName, String firstName) {
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

    @Override
    public String toString() {
        return "Builder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Person build(){
        return new Person(this);
    }
}

