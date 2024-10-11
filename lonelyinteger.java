import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_aAY a as parameter.
     */

    public static int LonelyInteger(List<Integer> a) {
    // Write your code here
    int u=0;
    for(int j=0;j<a.size();j++){
      int count=0;
      for(int i=0;i<a.size();i++){
         if(a.get(i)==a.get(j)){
             count++;
         } 
      }
         if(count==1){
             u=a.get(j);
             break;
         } 
    }
    return(u);
    }

}

public class lonelyinteger{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter no of elements");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("Enter interger elements in a line");
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.LonelyInteger(a);

        System.out.println(result);

        bufferedReader.close();
    }
}
