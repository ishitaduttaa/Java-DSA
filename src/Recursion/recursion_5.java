package Recursion;

//Print your name N times
public class recursion_5 {
    static void name(int n,String ele){
        if(n<=0) return;
        name(n-1,ele);
        System.out.println(n+"."+ele);
    }

    static void main(String[] args) {
        int n = 4;
        String ele = "ishita";
        name(4,ele);
    }
}
