public class Main {
    public static void main(String[] args) {
        ExampleClass a=new ExampleClass(5,10,15);
        ExampleClass b=(ExampleClass) a.getClone();
        System.out.println(b.x);
    }
}