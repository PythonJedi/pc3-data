	
    import java.util.Scanner;
    import java.io.*;
     
    public class InSum {
        public static void main(String [] args) throws FileNotFoundException 
{
            Scanner file = new Scanner(new File("in.txt"));
     
            int sum = 0;
     
            while(file.hasNextInt()) {
                sum += file.nextInt();
            }
            System.out.println(sum);
        }
    }
