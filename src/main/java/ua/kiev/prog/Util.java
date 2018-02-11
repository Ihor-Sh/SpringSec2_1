package ua.kiev.prog;

/**
 * Created by igor on 13.12.2017.
 */
public class Util {


public static void main(String[] s){
    int n=Integer.parseInt(s[0]);
    int t=0;int c=0;
    while(n>4){n-=5;
    System.out.println("Fill 5L jug\n5L: 5, 3L: 0, T: "+t+"\nPour from 5L jug into tank\n5L: 0, 3L: 0, T: "+(t+5));t+=5;c+=2;}while(n!=0){switch(n){case 1:System.out.println("Fill 3L jug\n5L: 0, 3L: 3, T: "+t+"\nPour from 3L jug into 5L jug\n5L: 3, 3L: 0, T: "+t+"\nFill 3L jug\n5L: 3, 3L: 3, T: "+t+"\nPour from 3L jug into 5L jug\n5L: 5, 3L: 1, T: "+t+"\nPour from 3L jug into tank\n5L: 5, 3L: 0, T: "+(t+1));n=0;c+=5;break;case 3:System.out.println("Fill 3L jug\n5L: 0, 3L: 3, T: "+t+"\nPour from 3L jug into tank\n5L: 0, 3L: 0, T: "+(t+3));n=0;c+=2;break;default:System.out.println("Fill 5L jug\n5L: 5, 3L: 0, T: "+t+"\nPour from 5L jug into 3L jug\n5L: 2, 3L: 3, T: "+t+"\nPour from 5L jug into tank\n5L: 0, 3L: 0, T: "+(t+2));n-=2;c+=3;t+=2;if(n==2){System.out.println("Empty 3L jug\n5L: 0, 3L: 0,T: "+t);c++;}break;}}System.out.println("Volume measured out in "+c+" turns");}}

