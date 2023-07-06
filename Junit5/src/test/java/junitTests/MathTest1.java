package junitTests;

import extensions.LoggingExtension;
import jdk.jshell.execution.Util;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runners.MethodSorters;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import utils.*;

@ExtendWith(LoggingExtension.class)
@DisplayName("Math Test 1")
public class MathTest1 {

    private Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @BeforeAll
    public static void beforeAllOuter() {
        System.out.println("Before all from outer");
    }

    @BeforeEach
    public void beforeEachOuter() {
        System.out.println("Before each from outer");
    }

    @Test
    public void test11() {
        System.out.println("Test 11");
        UtilClass.sleep(6);
        logger.info("Test 11");
    }

    @Test
    public void test12() {
        System.out.println("Test 12");
        UtilClass.sleep(5);
    }

    @Disabled
    @Nested
    @DisplayName("Test Math 1 features")
    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    class MathSubTest1 {

        @BeforeEach
        public void beforeEachInner1() {
            System.out.println("Before each from inner 1");
        }

        @Test
        public void inner1Test1() {
            var expectedList = List.of("Joey","Chandler","Phoebe");
            var actualList = List.of("Phoebe","Joey","Chandler").stream().sorted().toList();
            assertLinesMatch(expectedList, actualList);
//            assertEquals(expectedList, actualList);
            System.out.println("Inner 1 Test");
        }

        @Test
        public void inner1Test2() {
            var expectedList = List.of(1,2,3,4);
            var actualList = List.of(3,4,1,2).stream().sorted(Comparator.comparing(Integer::intValue).reversed()).toList();
            assertEquals(expectedList, actualList);
            System.out.println("Inner 2 Test");
        }

        @AfterEach
        public void afterEachInner1() {
            System.out.println("After each from inner 1");
        }
    }

    @Disabled
    @Nested
    @DisplayName("Test Math 2 features")
    class MathSubTest2 {
        @BeforeEach
        public void beforeEachInner2() {
            System.out.println("Before each from inner 2");
        }

        @Test
        public void inner2Test1() {
            assertAll("all together",
                    ()->assertTrue(true),
                    ()->assertEquals(2,2),
                    ()->assertFalse(false)
            );
            System.out.println("Inner 2 Test");
        }

        @RepeatedTest(3)
        public void inner2Test2() {
            System.out.println("repeated 3 times");
        }

        @AfterEach
        public void afterEachInner2() {
            System.out.println("After each from inner 2");
        }
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
