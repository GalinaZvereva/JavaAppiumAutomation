package Test2;

import org.junit.Assert;

public class MainClass {

    int number = 50;

    private int class_number = 20;

    private int getClassNumber(){
        return this.class_number = 45;
    }
    private int number(){
        return this.number;
    }


    public String returnNumber(){
        Assert.assertTrue(number + " не больше чем 45", getClassNumber() < number());
        return "Большее число: " + number;
    }
}
