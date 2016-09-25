import java.io.*;
import java.util.*;

public class DependencesOfEntities {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("output.txt")),true);

        Vector<int[]> L = new Vector<int[]>();

        String s;
        Boolean flag = false;

        while((s = br.readLine()) != null) {
            flag = false;

            String r[] = s.split(" ");

            for(int i = 0; i < L.size(); i++) {

                if(((L.elementAt(i))[0] == Integer.parseInt(r[1])) && ((L.elementAt(i))[1] == Integer.parseInt(r[0]))) {
                    flag = true;
                    //System.out.println((L.elementAt(i))[0] + " " + (L.elementAt(i))[1] + " " + (L.elementAt(i))[0]);
                    pw.println((L.elementAt(i))[0] + " " + (L.elementAt(i))[1] + " " + (L.elementAt(i))[0]);
                }
            }

            if(!flag) {
                L.addElement(new int[]{Integer.parseInt(r[0]), Integer.parseInt(r[1])});
            }
        }
    }
}