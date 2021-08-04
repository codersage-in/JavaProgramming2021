class Fibonacci {
    static int n1=0, n2=1, n3;
    static void printfibo(int cnt){
            if(cnt>0){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(" "+n3);
                printfibo(cnt-1);
            }
    }
    public static void main(String[] args){
        int count=10;
        System.out.print(n1+" "+n2);
        printfibo(count-2);
    }    
}
