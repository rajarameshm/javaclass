package com.org.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileTest {
    public static void main(String[] args) throws IOException {
        FileTest fileTest = new FileTest();
        //fileTest.createNewFile();
        //fileTest.createNewFileUsingFileOutputStream();
        //fileTest.testBufferedWriter();
        //fileTest.renameFile();
        //fileTest.copyFile();
        //fileTest.deleteFile();
        fileTest.testNio();
    }

    private void testNio() {
        File sourceFile = new File("test.text");
        File targetFile = new File("new_test.text");
        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("successfully copied !");
            Files.delete(targetFile.toPath());
            System.out.println("successfully deleted !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void deleteFile() {
        File file = new File("new_test.text");
        boolean isDeleted = file.delete();
        if (isDeleted) {
            System.out.println("successfully deleted");
        } else {
            System.out.println("failed to delete the file");
        }
    }

    private void copyFile() throws IOException {
        File sourceFile = new File("new_test.text");
        File targetFile = new File("test.text");
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
        byte[] bufferArray = new byte[1024];
        int length;
        while ((length = fileInputStream.read(bufferArray)) > 0) {
            fileOutputStream.write(bufferArray, 0, length);
        }
        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    private void renameFile() {
        File file = new File("test.text");
        boolean isRenamed = file.renameTo(new File("new_test.text"));
        if (isRenamed) {
            System.out.println("file successfully renamed from test.text to new_test.text");
        } else {
            System.out.println("it is failed");
        }
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
