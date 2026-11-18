import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.print("Stop");
        }else if(n == 2){
            System.out.print("Standby");
        }else if(n == 3){
            System.out.print("Go");
        }else{
            System.out.print("Unknown");
        }
    }
}