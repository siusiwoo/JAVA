import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        if(A<B){
        System.out.println("<");
        }
        if(A>B){
        System.out.println(">");
        }
        if(A==B){
        System.out.println("==");
        }
    }
}