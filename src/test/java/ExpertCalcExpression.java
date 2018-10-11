import org.junit.Assert;
import org.junit.Test;

public class ExpertCalcExpression {

    static public Expert expertCalculator = new Expert();

//    @Test
//    public void callAddFromExpertCalc() {
//        Integer result = expertCalculator.add((Integer) 3);
//        Assert.assertEquals((Integer) 3, result);
//
//        Assert.assertTrue(Boolean.FALSE);    //asta e o conditie.
//    }
//
//    @Test
//    public void callPowFromExpertCalc() {
//        Integer result = expertCalculator.pow((Integer) 3, (Integer) 10);
//        Assert.assertEquals((Integer) 1024, result);
//    }


                                 ///Tema

    @Test  //Pozitiv
    public void powInt() {
        Integer result = expertCalculator.pow(2, 7);
        Assert.assertEquals("Error Message", (Integer) 128, result);
    }

    @Test  //Negativ
    public void powIntN() {
        Integer result = expertCalculator.pow(2, 7);
        Assert.assertNotEquals("Error Message", (Integer) 12, result);
    }

    @Test  //Pozitiv
    public void powDoubleTrue() {
        double result = expertCalculator.pow(2.5, 2);
        Assert.assertTrue("Error Message", 6.25 == result);
    }

    @Test  //Negativ
    public void powDoubleFalse() {
        double result = expertCalculator.pow(2.5, 2);
        Assert.assertFalse("Error Message", 2.255 == result);
    }

    @Test  //Pozitiv
    public void factorialInt() {
        int result = expertCalculator.factorial(4);
        Assert.assertEquals("Error message", 24, result);
    }

    @Test  //Negativ
    public void factorialIntN() {
        int result = expertCalculator.factorial(4);
        Assert.assertNotEquals("Error message", 15, result);
    }

    @Test //Pozitiv
    public void factorialNotNull() {
        Double result = expertCalculator.factorial(2.5);
        Assert.assertNotNull("Error message", result);
    }

    @Test //Negativ
    public void factorialFalse() {
        double result = expertCalculator.factorial(5);
        Assert.assertFalse("Error Message", 159 == result);
    }

    @Test //Negativ
    public void factorialTrue() {
        double result = expertCalculator.factorial(5);
        Assert.assertTrue("Error Message", 120 == result);
    }
}




