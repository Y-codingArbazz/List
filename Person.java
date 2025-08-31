public class Person {
    String name;
    int id;
    String Surname;
    char Gender;
    public Person(String name, int id, String surname, char gender) {
        this.name = name;
        this.id = id;
        Surname = surname;
        Gender = gender;
    }
    public Person() {
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", Surname=" + Surname + ", Gender=" + Gender + "]";
    }
    
    
}
