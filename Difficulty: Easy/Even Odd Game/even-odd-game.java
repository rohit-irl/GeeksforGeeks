import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 != 0){
            System.out.print("You");
        }else{
            System.out.print("Friend");
        }

        sc.close();
    }
}