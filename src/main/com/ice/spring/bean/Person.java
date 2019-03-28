package ice.spring.bean;

/**
 * @author ice
 * @date 19-3-28
 */
public class Person {

    private String name;

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
