package testNG;

import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

public class TestNGAnnotation01 {
    public static void main(String[] args) {
        System.out.println("This is not a TestNG test 01");
        TestNGAnnotation01 testNGAnnotation01 =new TestNGAnnotation01();
        testNGAnnotation01.notTestNGMethod();
    }

    public void notTestNGMethod(){
        System.out.println("This is not a TestNG test 02");
    }

    @Test
    public void test(){
        System.out.println("Test 01");
    }
}
