import org.testng.annotations.Test;

/**
 * Created by ozakarias on 1/8/2018.
 */
public class SanityTests {

    UserServices asd = new UserServices();

    @Test
    public void testSomething() {
        System.out.println("This test is part of the Sanity suite.");

        //2.c
        asd.addUser();

    }

    @Test
    public void testSomethingElse() {
        System.out.println("testSomethingElse() method was run.");

        //2.f
        UserServices.doSomethingStatic();
        UserServices.doSomethingElse();

    }



}
