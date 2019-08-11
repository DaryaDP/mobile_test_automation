import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass newObject = new MainClass();
        if (newObject.getLocalNumber() == 14) {
            System.out.println("Local number is 14");
        } else {
            System.out.println("Error! Local number is not 14 :(");
        }
    }
}
