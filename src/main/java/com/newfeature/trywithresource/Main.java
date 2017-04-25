package com.newfeature.trywithresource;

import java.io.*;

/**
 * Try-With-Resources测试
 * Created by Administrator on 2017/4/25 0025.
 */
public class Main {

    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream("1.txt");
             OutputStream fos = new FileOutputStream("2.txt")){

            byte[] buf = new byte[8192];

            int i;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
