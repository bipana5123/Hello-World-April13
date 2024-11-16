package Assignment1;

import java.util.List;

public class Five5 {
    public static void main(String[] args) {
        String[] data = {"cat", "dog", "bird", "fish"};  // Sample Data
        int start = 0;
        int end = data.length - 1;

        while (start < end)
        {
            String temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }

        for (String item : data) {
            System.out.print(item + " ");
        }



    }
}
