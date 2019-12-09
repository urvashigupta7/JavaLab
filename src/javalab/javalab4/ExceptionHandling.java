package javalab.javalab4;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
