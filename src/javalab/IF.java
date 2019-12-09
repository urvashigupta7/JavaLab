package javalab;

public interface IF {
    public void show();
}
interface IF2
{
    public void show2();

}
class TestClass implements IF,IF2
{
    @Override
    public void show() {
        System.out.println("Hello from show");
    }

    @Override
    public void show2() {
        System.out.println("Hello from show2");
    }
    public static void main(String[] args) {
        TestClass t1=new TestClass();
        t1.show();
        t1.show2();
    }
}