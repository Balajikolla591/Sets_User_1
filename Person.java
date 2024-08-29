public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
private int id;
    private String name;
    private int salary;

    
    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    
    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

