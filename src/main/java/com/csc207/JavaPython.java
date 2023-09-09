package com.csc207;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class JavaPython {
    public static void main(String[] args) {
//        TemperatureConverter.convertF();
//        LineReader.readDat();
        WordCounter.count();
    }
}

class TemperatureConverter {
    public static void convertF() {
        double f;
        double c;
        Scanner my_input = new Scanner(System.in);
        System.out.println("Enter the F degree:");
        f = my_input.nextDouble();
        c = (f - 32) * 5.0 / 9.0;
        System.out.println("The C degree is " + c);
    }
}

class LineReader {
    public static void readDat() {
        List<Integer> dataList = new ArrayList<>(10);
        Scanner myScanner = null;
        int elem;
        try {
            myScanner = new Scanner(new File("/Users/henrys/Study/UTSG/csc207-202309/preview/Study-Java-Basics/src/main/java/com/csc207/test.dat"));
//            myScanner = new Scanner(new File("test.dat"));
        } catch (IOException e) {
            System.out.println("Unable to open the file!");
            e.printStackTrace();
            System.exit(0);
        }
//         initialize the Arraylist to all 0's
        for (int i = 0; i < 10; i++) {
            dataList.add(0);
        }

        while (myScanner.hasNext()) {
            elem = myScanner.nextInt();
            int curr = dataList.get(elem);
            dataList.set(elem, curr + 1);
        }
        int idx = 0;
        for(Integer j: dataList){
            System.out.println("There's " + j + " " + idx +"'s in the data.");
            idx += 1;
        }
        System.out.println(dataList);


    }
}

class WordCounter{
    public static void count(){
        Scanner scanner = null;
        String word;
        Map<String, Integer> stats;
        Integer wordCount;
        try {
            scanner = new Scanner(new File("/Users/henrys/Study/UTSG/csc207-202309/preview/Study-Java-Basics/src/main/java/com/csc207/test2.dat"));
//            scanner = new Scanner(new File("test2.dat"));
        }catch (IOException e){
            System.out.println("Unable to open file!");
            e.printStackTrace();
            System.exit(0);
        }

        stats = new TreeMap<>();
        while(scanner.hasNext()){
            word = scanner.next().toLowerCase();
            wordCount = stats.get(word);
            if(wordCount == null){
                stats.put(word, 1);
            }else {
                stats.put(word, ++wordCount);
            }
        }

        for(String str: stats.keySet()){
            System.out.println("Frequency of " + str + "is " + stats.get(str));
        }
    }
}