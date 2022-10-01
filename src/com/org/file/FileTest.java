package com.org.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileTest {
    public static void main(String[] args) throws IOException {
        FileTest fileTest = new FileTest();
        fileTest.createNewFile();
        fileTest.createNewFileUsingFileOutputStream();
        fileTest.testBufferedWriter();
    }

    private void testBufferedWriter() throws IOException {
        String content = "some content to be written to the file";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.text"));
        bufferedWriter.write(content);
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write(content+" content modified");
        bufferedWriter.flush();
        bufferedWriter.close();

    }

    private void createNewFileUsingFileOutputStream() {
        String content = "some content to be written to the file";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("test1.text"));
            fileOutputStream.write(content.getBytes(StandardCharsets.UTF_8), 0, content.length());
        } catch (FileNotFoundException e) {
            System.out.println("file not found to write");
        }
        catch (IOException e) {
            System.out.println("got some IO Exception ");
        } finally {
            try{
                fileOutputStream.close();
            }catch (IOException e) {
                System.out.println("got some IO Exception ");
            }

        }

    }

    private void createNewFile() {
        File file = new File("test.text");
        boolean fileCreated = false;
        try {
            fileCreated = file.createNewFile();
        } catch (IOException e) {
            System.out.println("got some IO Exception ");
        }
        if (fileCreated)
            System.out.println("file created");
        else
            System.out.println("file exists");
    }
}
