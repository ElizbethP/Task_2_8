package com.liza;

import java.io.*;
import java.net.*;
import java.net.URLConnection;

public class Task_2_8 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.cs.usfca.edu/~parrt/doc/java/JavaIO-notes.pdf");
        URLConnection uc = url.openConnection();
        File file = new File("./io_notes.pdf");


        try {
            InputStream in = uc.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(in);

            FileOutputStream fos = new FileOutputStream(file);
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int i;
            while ((i = bis.read()) != -1) {
//                bos.write(i);
                fos.write(i);

            }
            in.close();
            bis.close();
            fos.close();
//            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }












































       /* try {
            Throwable t = new RuntimeException();
            throw t;




        } catch (RuntimeException e) {
            System.out.println(" run ");


        }catch (Throwable h){
            System.out.println("Throwable");
        }


        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                // НИЧЕГО
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - нет исключения
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // заходим - выполнение в норме
        } catch (Exception e) {
            System.err.print(" 6");     // НЕ заходим - нет исключения
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение в норме
    */
    }
}



