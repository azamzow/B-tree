import java.io.*;
import java.io.InputStreamReader;

public class SearchBtree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int[] root = {13};

        int[] l11 = {5,9};
        int[] r11 = {23,25,35};
        int[][] level1 = {l11,r11};

        int[] l21 = {1,3,4};
        int[] l22 = {5,7,8};
        int[] l23 = {9,11};
        int[][] leftLevel2 = {l21,l22,l23};

        int[] r21 = {13,14,19};
        int[] r22 = {23,24};
        int[] r23 = {25,31};
        int[] r24 = {35,45};
        int[][] rightLevel2 = {r21,r22,r23,r24};

        int x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number to search for (must be a number): ");
        x = Integer.parseInt(br.readLine());

        boolean found = false;
        int[] current = root;
        int level = 0;
        int record = 1;
        int rorl = 0;
        while (level < 4){

            if (level == 3){
                System.out.println("Doesn't Exist");
            }
            System.out.println("Array Searched is: Level " +level + " Record " + record);
            int result = searchArray(current, x);
            if (result == x){
                if(current == root){
                    youFoundMe(level, record, current, x);
                    break;
                }
                youFoundMe(level, record, current, x);
                break;
            }else{
                level = level + 1;
                record = result + 1;
                if(level == 1){
                    current = level1[result];
                    rorl = result;
                }
                else if(level == 2){
                    if(rorl == 0){
                        current = leftLevel2[result];
                    }else if(rorl == 1){
                        record = record + 3;
                        current = rightLevel2[result];
                    }
                }
            }
        }

    }

    public static void youFoundMe(int level, int record, int[] array, int x){
        if(level == 0){
            System.out.print("The number " + x + " is in the root: ");
        }else{
            System.out.print("The number " + x + " is on Level " + level +  " in Record " + record + ": ");
        }

        System.out.print("{");
        for(int z : array){
            System.out.print(z + " ");
        }
        System.out.println("}");
    }

    public static int searchArray(int [] array, int x){
        int i;
        for(i = 0; i < array.length; i++){
            if(x < array[i]){
                break;
            }
            else if(x > array[i]){
                if(i + 1 == array.length){
                    i = i + 1;
                    break;
                }else if(x < array[i+1]){
                    i = i + 1;
                    break;
                }
            }
            else if(x == array[i]){
                i = array[i];
                break;
            }
        }
        return i;
    }
}
