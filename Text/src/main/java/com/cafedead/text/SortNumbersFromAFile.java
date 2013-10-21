package com.cafedead.text;


import java.io.*;
import java.util.Arrays;

public class SortNumbersFromAFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/dev/git/Projects/text/src/main/resources/numbers.txt");
        System.out.println(file.isFile());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);
        String line;
        String fileContents = "";
        while (null != (line = bufferedFileReader.readLine())) {
            fileContents = fileContents.concat(line);
        }
        String[] stringArray = fileContents.split(",");
        Integer[] intArray = new Integer[stringArray.length];

        for(int i = 0 ; i < stringArray.length;i++){
            intArray[i] = Integer.valueOf(stringArray[i]);
       }
        Arrays.sort(intArray);

        for(int i = 0 ; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
}
