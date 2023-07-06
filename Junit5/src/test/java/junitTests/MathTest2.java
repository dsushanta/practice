package junitTests;

import org.junit.jupiter.api.*;
import utils.UtilClass;

@DisplayName("Math Test 2")
public class MathTest2 {

    @BeforeAll
    public static void beforeAllOuter() {
        System.out.println("Before all from outer");
    }

    @BeforeEach
    public void beforeEachOuter() {
        System.out.println("Before each from outer");
    }

    @Test
    public void test21() {
        System.out.println("Test 21");
        UtilClass.sleep(8);
    }

    @Test
    public void test22() {
        System.out.println("Test 22");
        UtilClass.sleep(7);
    }

    @AfterEach
    public void afterEachOuter() {
        System.out.println("After each from outer");
    }

    @AfterAll
    public static void afterAllOuter() {
        System.out.println("After all from outer");
    }
}
