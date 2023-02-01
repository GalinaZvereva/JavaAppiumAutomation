package Test3;

import org.junit.Assert;

public class MainClass {
    private String class_string = "Hello, world!";
    private String Hello = "Hello";
    private String hello = "hello";

    private String getClassString(){
        return this.class_string;
    }
    private String textMessage(){
        return "Строка содержит слово ";
    }
    private String textMessage_1(){
        return "Строка "+ getClassString() +" не содержит слово ";
    }

    public String test() {
        if(getClassString().contains(Hello)){
            System.out.println(textMessage() + Hello);
        }else if(getClassString().contains(hello)){
            System.out.println(textMessage() + hello);
        }else {
            Assert.fail(textMessage_1() + Hello +" или "+ hello);
        }
        return "";
    }
}
