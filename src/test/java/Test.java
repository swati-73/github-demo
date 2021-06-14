import org.testng.annotations.*;
import org.testng.annotations.*;
public class Test {

    @org.testng.annotations.Test
    public void test(){
        System.out.println("test");
    }

    @org.testng.annotations.Test
    public void test2(){
        System.out.println("test2");
        assert false;
    }

    @org.testng.annotations.Test
    public void test3(){
        System.out.println("test3");

    }

}
