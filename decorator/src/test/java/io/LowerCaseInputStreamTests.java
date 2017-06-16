package io;

import org.junit.Test;

import java.io.*;

/**
 * Created by ross.moug on 16/06/2017.
 */
public class LowerCaseInputStreamTests {

    @Test
    public void lowerCaseInputStreamTest() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(this.getClass().getResourceAsStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
