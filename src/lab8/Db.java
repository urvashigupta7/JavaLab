//package lab8;
//import java.util.*;
//import java.sql.*;
//
//public class Db {
//
//    public static Connection getConnection() {
//
//        Connection con = null;
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql//localhost:3306/Student","system","12345");
//
//        } catch (Exception e) {
//
//            System.out.println(e);
//
//        }
//
//        return con;
//
//    }
//
//    public static void main(String[] args) {
//
//        String user="system";
//        String password="12345";
//        Scanner scrn = new Scanner(System.in);
//        System.out.println("enter name");
//        String name = scrn.next();
//        System.out.println("enter roll no");
//        int roll = scrn.nextInt();
//        System.out.println("enter class");
//        String cls =  scrn.next();
//        String sql="insert into Student values('"+name+"',"+roll+",'"+cls+"')";
//        try{
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
//
//
//            Connection con=DriverManager.getConnection(url,user,password);
//            Statement st=con.createStatement();
//            int m=st.executeUpdate(sql);
//            if(m==1){
//                System.out.println("inserted successfully");
//                System.out.println(st.executeQuery("select * from Student"));
//            }
//            else{
//                System.out.println("insertion failed");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
