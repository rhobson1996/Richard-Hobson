/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author RichardH
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Java Test Program - Impact
        //2 methods: Collect() - converts String comma delimeted integer list into Collection<Integer> format
        //           summarizeCollection() - groups integers by their consecutive numbers without jump - returns the summarized list as a String
        //output in the format: "Collection: {SummarizedCollection}"
        //Assumption: String input integer list is given already sorted in ascending order
        TestClass impactTest = new TestClass();
        String[] testUnits = new String[]{"1,3,6,7,8,12,13,14,15,21,22,23,24,31", "1", "", "Word", "-1,0,1"};
        for (int i = 0; i < testUnits.length; i++) {
            Collection<Integer> collection = impactTest.collect(testUnits[i]);

            String output = impactTest.summarizeCollection(collection);
            System.out.println("Collection: " + output + "\n");
        }
    }

}
