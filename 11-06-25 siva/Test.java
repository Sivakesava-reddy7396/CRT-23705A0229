import java.util.Scanner;
import java.util.Arrays;
class Test{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }
    }
