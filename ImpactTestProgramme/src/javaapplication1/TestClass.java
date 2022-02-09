package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.NullPointerException;

/**
 *
 * @author RichardH
 */
public class TestClass implements NumberRangeSummarizer {

    //collect the input
    public Collection<Integer> collect(String input) {
        Collection<Integer> ret = new ArrayList();
        if (!input.isEmpty()) {
            String[] inputList = input.split(",");
            for (int i = 0; i < inputList.length; i++) {
                try {
                    ret.add(Integer.parseInt(inputList[i]));
                } catch (NumberFormatException e) {
                    System.out.println("Input Invalid - cannot parse into Integer Value");
                }
            }
        }
        return ret;

    }

    //get the summarized string
    public String summarizeCollection(Collection<Integer> input) {
        String output = "";
        try {
            if (!input.isEmpty()) {
                Iterator it = input.iterator();
                int first = (int) it.next();
                int last = first;
                int comp = 0;
                output += first + "";
                while (it.hasNext()) {
                    comp = (int) it.next();
                    if (comp == last + 1) {
                        last = comp;
                        if (!it.hasNext()) {
                            output += "-" + last;
                        }
                    } else {
                        if (last > first) {
                            output += "-" + last + ", " + comp;
                            last = comp;
                            first = last;
                        } else {
                            output += ", " + comp;
                            last = comp;
                            first = last;
                        }
                    }
                }
                return output;
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Summarize Failed - Collection Empty");
            return "";
        }
    }
}
