package io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ross.moug on 16/06/2017.
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
