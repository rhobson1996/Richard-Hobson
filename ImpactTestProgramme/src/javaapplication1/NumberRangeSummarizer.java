package javaapplication1;


import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author RichardH
 */
public interface NumberRangeSummarizer {
    
//collect the input
    Collection<Integer> collect(String input);

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);
}
