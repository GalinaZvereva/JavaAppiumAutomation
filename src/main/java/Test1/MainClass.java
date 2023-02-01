package Test1;

import org.junit.Assert;

public class MainClass {

    int number = 14;

    public int getLocalNumber(){
        return this.number;
    }

    public String checkNumber(){
        Assert.assertTrue("мы не можем вернуть число, так как "+ getLocalNumber()+" не равно 14", getLocalNumber() == 14);
        return " проверка пройдена " ;
    }
}
