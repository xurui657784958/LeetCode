import MyPractice.util.Solution023;

public class Solution024 {
    public static void main(String[] args){
        System.out.println(Solution024.feibulaqi(30));
    }

    public static int feibulaqi(int n){
        if(n <= 2){
            return 1;
        }else {
            return feibulaqi(n - 1) + feibulaqi(n - 2);
        }
    }
}
/*
* f(100) = f(99) + f(98)
* f(99) = f(98) + f(97)
* */