package EveryDayCode;

import java.io.*;

public class TestTransient implements Serializable {
    static int l = 40; // Removed 'transient' keyword
    int i = 10;
    int j = 20;
    transient int k = 30;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestTransient testTransient = new TestTransient();
        // serialization
        FileOutputStream fos = new FileOutputStream("TestTransient.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(testTransient);
        // De-serialization
        FileInputStream fis = new FileInputStream("TestTransient.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestTransient output = (TestTransient) ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + l);
    }
}
