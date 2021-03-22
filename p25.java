
import java.util.*;
import java.io.*;

public class p25 {

    public static void main(String[] arr) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        } catch (Exception ee) {
            System.out.println(ee);
        }

    }

}
