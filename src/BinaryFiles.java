import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf=new RandomAccessFile("binaryfile.dat","rw");
        raf.writeInt(65);
        raf.writeInt(7);
        raf.writeInt(13);
        raf.writeInt(27);
        raf.writeInt(561);

        raf.seek(9);
        System.out.println(raf.readInt());


        raf.close();
    }
}
