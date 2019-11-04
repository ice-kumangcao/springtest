package ice.spring.bean;

/**
 * @author ice
 * @date 19-3-28
 */
public class Person {

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(this.name + " walk");
    }
}
