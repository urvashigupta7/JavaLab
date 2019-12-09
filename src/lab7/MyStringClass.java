package lab7;

public class MyStringClass {
    public static void main(String[] args) {
        String st=new String("Urvashi");
        System.out.println(st.charAt(4));
        System.out.println(st.equals("Urvashi"));
        System.out.println(st.toUpperCase());
        System.out.println(st.concat("Gupta"));
        System.out.println(st.contains("a"));
        System.out.println(st.indexOf('g'));
        System.out.println(st.replace('a','A'));
        st=st.toLowerCase();
        System.out.println(st);
        System.out.println(st.length());
    }
}