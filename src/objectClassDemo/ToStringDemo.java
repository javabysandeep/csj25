package objectClassDemo;

public class ToStringDemo {
    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo();
        System.out.println(toStringDemo);//implicit call to the toString
        System.out.println(toStringDemo.toString());//explicit call to the toString

        String className = toStringDemo.getClass().getName();
        int hashCode = toStringDemo.hashCode();
        String hashCodeInHexaDecimal = Integer.toHexString(hashCode);

        System.out.println(className + "@"+hashCodeInHexaDecimal);
    }
}
