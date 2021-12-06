import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventOfCode1 {
    public static void main(String[] args) throws IOException{

        //Read file with depth values
        Scanner inputFile = new Scanner(new File("AdventOfCode1-1.txt")).useDelimiter("\n");

        //Create an ArrayList to handle values
        List<Integer> depths = new ArrayList<>();

        //While loop to read and store values from file
        while (inputFile.hasNext()){
            int addDepth = inputFile.nextInt();
            depths.add(addDepth);
        }

        //Close file
        inputFile.close();

        //Convert to array
        Integer[] depthArray = depths.toArray(new Integer[0]);

        //Count depths greater than the last.
        int counter = 0;
        for (int i = 0; i < depthArray.length - 1; i++){
            if (depthArray[i + 1] > depthArray[i]){
                counter++;
            }
        }
        //Print out total of depths greater than the last.
        System.out.println("There are " +counter + " depths greater than the last.");
    }
}