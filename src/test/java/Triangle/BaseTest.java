package Triangle;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void Before() {
        System.out.println("start before method");
    }

    @AfterTest
    public void After() {
        System.out.println("start before method");
    }
}
