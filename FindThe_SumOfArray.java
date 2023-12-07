import java.util.Scanner;

public class FindThe_SumOfArray {
    public static void FindTheSumOfArray(int[] arr,int SumValue){
        for (int i=0;i<=arr.length;i++){
            for (int j=i+1;j< arr.length;j++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] +arr[k]== SumValue) {

                        System.out.println(arr[i] + " + " + arr[j] +" + "+ arr[k]+ " = " + SumValue);
                        return;
                    }

                }
            }


        }
        System.out.println("Not Print");
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Element: ");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the SumValue: ");
        int SumValue = scanner.nextInt();
        FindTheSumOfArray(arr,SumValue);
        scanner.close();
    }

}
