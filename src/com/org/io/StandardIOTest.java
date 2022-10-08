package com.org.io;

import java.io.*;

public class StandardIOTest {
    public static void main(String[] args) throws IOException {
        StandardIOTest standardIOTest = new StandardIOTest();
        //standardIOTest.systemInTest_charReading();
        //standardIOTest.systemInTest_lineReading();
        //standardIOTest.fileWriterTest();
        //standardIOTest.fileReaderTest();
        standardIOTest.bufferedReaderTest_lineReading();
    }

    private void bufferedReaderTest_lineReading() throws IOException {
        File file = new File("test.text");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        fileReader.close();
        bufferedReader.close();
    }

    private void fileReaderTest() throws IOException {
        FileReader fileReader = null;
        //file reader to read from given file
        fileReader = new FileReader("test.text");
        int temp;
        while ((temp = fileReader.read()) != -1) {
            System.out.print((char)temp);
        }
        fileReader.close();
    }

    private void fileWriterTest() throws IOException {
        //define a file
        File file = new File("test.text");
        String content = "something has been written here\n" +
                "to test the streams\n";
        //instance of file writer
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.flush();
        fileWriter.close();

    }

    private void systemInTest_lineReading() throws IOException {
        BufferedReader bufferedReader = null;
        //create an instance of buffered reader
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter something or 'exit' to quit !!");
        String line;
        do {
            line = bufferedReader.readLine();
            System.out.println(line);
        } while (!line.equalsIgnoreCase("exit"));
    }

    private void systemInTest_charReading() throws IOException {
        //reading from System.in
        InputStreamReader inputStreamReader = null;
        //store input in reader
        inputStreamReader = new InputStreamReader(System.in);
        System.out.println("enter any character, or '0' to quit !!");
        char anyChar;
        do {
            //read char
            anyChar = (char)inputStreamReader.read();
            System.out.println(anyChar);

        } while (anyChar != '0');
    }

}
