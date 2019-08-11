import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    //lesson 0 task 1
    @Test
    public void testGetLocalNumber() {
        MainClass newObject = new MainClass();
        if (newObject.getLocalNumber() == 14) {
            System.out.println("Local number is 14");
        } else {
            System.out.println("Error! Local number is not 14 :(");
        }
    }

    //lesson 0 task 2
    @Test
    public void testGetClassNumber() {
        MainClass newObject = new MainClass();
        if (newObject.getClassNumber() > 45) {
            System.out.println("Class Number more than 45");
        } else {
            System.out.println("Class Number is 45 or less than 45");
        }
    }

    //    lesson 0 task 3
    @Test
    public void testGetClassString() {
        MainClass newObject = new MainClass();
        String txt = newObject.getClassString();
        Assert.assertTrue("Class String doesn't contain word 'hello'", txt.contains("Hello") || txt.contains("hello"));
    }
}
