package book.bean.lookupmethod;

/**
 * @author ice
 * @date 19-8-7
 */
public class GetBeanTest {

    public void showMe() {
        this.getBean().showMe();
    }

    public User getBean(){
        System.out.println("i am getbeanTest");
        return null;
    }
}
