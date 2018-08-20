package Blog;

import java.io.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        File file = new File("abc.dat");
        OutputStream outputStream = null;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            outputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String ss = "";
        String s = "|15858811693|20180321085028|20180320851028|20991231235959|mgakzzb|asdbss1\n";
        long l = 201803210850281157L;
        for (int i = 0; i < 2000000; i++) {
            l = l + 1;
            ss = l + "" + s;
            byte[] bs = ss.getBytes();
            try {
                outputStream.write(bs);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
