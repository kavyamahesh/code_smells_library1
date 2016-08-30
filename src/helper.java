import java.io.*;
import java.util.*;
public class helper {
    public int getoption() {
        String inputline = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return Integer.parseInt(inputline);
    }
    public String readstring(String prompt)
    {
        System.out.println(prompt + ":  ");
        String inputline = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return inputline.toLowerCase();

    }
}

