package lab8;

import java.io.*;

public class readFile {
    public static void main(String[] args) throws Exception {

        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)

        File file=new File("C:\\Users\\Bhoomik\\Desktop\\abhinav.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        while((st=br.readLine())!=null){
            System.out.println(st);
        }
        String s="hello world";
        File f=new File("C:\\Users\\Bhoomik\\Desktop\\bhoomik.txt");
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            bw.write(s);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
