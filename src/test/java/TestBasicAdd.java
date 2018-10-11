import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import java.sql.SQLOutput;


public class TestBasicAdd {
    static Basic basicCalculator;

    static public void printMessage(String message) {
        System.out.println(message);
    }

    @BeforeClass
    static public void setUp() {
        basicCalculator = new Basic();
        printMessage("SetUp");
    }
//
//    @Before
//    public void setUpTest() {
//        printMessage("BeforeEachTest");
//    }
//
//    @Test
//    public void testAddDoubleSameValue() {
//        Double result = Obiect.add(2.3, 3.5);
//        //failureMessage,expected,actual
//        Assert.assertEquals("Message in case of error", (Double) 5.8, result);
//        Object object = null;
//        Assert.assertNotNull("Message in case of failure - result null.", object);
//    }
//
//    @Test
//    public void testAdd2MaxInts() {
//        Integer result = Obiect.add(Integer.MAX_VALUE, Integer.MIN_VALUE);
//        Assert.fail();
//    }
//
//    @Test
//    public void testAddSingleValue() {
//        Integer result = Obiect.add();
//        Assert.assertEquals((Integer) 5, result);
//    }


    //TEMA


    @Test  //Pozitiv
    public void testAddInteger() {
        Integer result = basicCalculator.add(2, 7);
        //failureMessage,expected,actual
        Assert.assertEquals("Error Message", (Integer) 9, result);
    }

    @Test   //Negativ
    public void testAddInteger2() {
        Integer result = basicCalculator.add(2, 7);
        //failureMessage,expected,actual
        Assert.assertNotEquals("Error Message", (Integer) 2, result);
    }

    @Test  //Pozitiv
    public void testAddDouble() {
        Double result = basicCalculator.add(3.6, 5.84);
        //failureMessage,expected,actual
        Assert.assertEquals("Error Message", (Double) 9.44, result);
    }

    @Test  //Negativ
    public void testAddDouble2() {
        Double result = basicCalculator.add(3.6, 5.84);
        Assert.assertNotEquals("Error Message", 5.44, result);
    }

    @Test  //Pozitiv
    public void testValueAddLong() {
        long result = basicCalculator.add(36535611, 3351213);
        Assert.assertTrue("Error Message", (long) 39886824 == result);
    }

    @Test  //Negativ
    public void testValueAddLong2() {
        long result = basicCalculator.add(36535611, 3351213);
        Assert.assertFalse("Error Message", (long) 3988624 == result);
    }

    @Test  //Pozitiv
    public void testSubstractSame() {
        Integer result = basicCalculator.substract(31, 12);
        Assert.assertSame(19, 19);
    }

    @Test  //Pozitiv
    public void testSubstractNotSame() {
        Integer result = basicCalculator.substract(31, 12);
        Assert.assertNotSame(1, 19);
    }

    @Test //Positiv
    public void testSubstractNotNull() {
        Double result = basicCalculator.substract(3.3, 2.5);
        Assert.assertNotNull("Error Message", result);
    }


    @Test //Negativ
    public void testMultiplySingleValue() {
        Integer actualResult = basicCalculator.multiply(3);
        Integer expectedResult = 5;
        Assert.assertNotEquals(expectedResult, actualResult);
    }

    @Test //Pozitiv
    public void testMultiplyEquals() {
        Integer actualResult = basicCalculator.multiply(11, 3);
        Assert.assertEquals((Integer) 33, actualResult);
    }

    @Test //Pozitiv
    public void testDivideTrue() {
        Double result = basicCalculator.divide(3, 2);
        Assert.assertTrue(1.5 == result);
    }

    @Test //Negativ
    public void testDivideFalse() {
        Double result = basicCalculator.divide(3, 2);
        Assert.assertFalse(1.7 == result);
    }

    @Test //Pozitiv
    public void testDivideNotNull() {
        Double result = basicCalculator.divide(3, 2);
        Assert.assertNotNull("Error message", result);
    }
}












