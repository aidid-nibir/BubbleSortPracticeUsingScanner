import java.util.Scanner;
public class BubbleSortPracticeUsingScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose how many integer you want to enter");
        int swap;
        int num=sc.nextInt();
        int array[] = new int[num];
        for(int i=0; i<num; i++){
            System.out.println("Enter the number in position "+(i+1));
            array[i] = sc.nextInt();
        }

        for(int j=0; j<num; j++){
            for(int k=0; k<num-j-1; k++){
                if(array[k]>array[k+1]){
                    swap = array[k];
                    array[k]=array[k+1];
                    array[k+1]= swap;

                }
            }
        }
        for(int x=0; x<num; x++)
        {
            System.out.printf(array[x]+"\t");
        }
    }
}
