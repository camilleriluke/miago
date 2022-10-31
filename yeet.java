import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String wishlist = in.nextLine();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String item = in.nextLine();
            if(wishlist.contains(item)) { 
                System.out.println("YOINK");
            } else { 
                System.out.println("YEET");
            }
        }
    }
}
