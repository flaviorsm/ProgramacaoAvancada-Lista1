package somadig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Flávio Roberto dos Santos Moreira
 */
public class Somadig {
    static BufferedReader s;
    static char[] s1;
    public static void main(String[] args) throws IOException {
        int total;
        do
        {
            total = 0;
            s = new BufferedReader(new InputStreamReader(System.in));
            s1 = s.readLine().toCharArray();
            for(int i = 0; i < s1.length; i++)
                total += Character.getNumericValue(s1[i]);
            
            if(total > 0)
                System.out.println(total);
            
        }while(total != 0);
    }    
}