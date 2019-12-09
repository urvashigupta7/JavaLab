package javalab.javalab4;

import java.util.Scanner;

public class Distance {
    int distance;
    public void getdistance(){
        System.out.println("enter the distance");
        Scanner scrn=new Scanner(System.in);
        this.distance=scrn.nextInt();
    }
    public Distance addDistance(Distance d2){
        Distance temp=new Distance();
        temp.distance=this.distance+d2.distance;
        return temp;
    }
    public void printdistance(){
        System.out.println("Distance="+this.distance);
    }

    public static void main(String[] args) {
        Distance d1=new Distance();
        Distance d2=new Distance();
        d1.getdistance();
        d2.getdistance();
        Distance d3=new Distance();
        d3=d1.addDistance(d2);
        d3.printdistance();
    }

}
