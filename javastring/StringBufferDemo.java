package javastring;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer StringBuffer = new StringBuffer();
        StringBuffer.append("Welcome ");
        StringBuffer.append("To ");
        StringBuffer.append("Java World!!! ");
        StringBuffer.insert(0,"**");
        StringBuffer.replace(0,2,"");
        //StringBuffer.reverse();
        System.out.println(StringBuffer);
    }
}
