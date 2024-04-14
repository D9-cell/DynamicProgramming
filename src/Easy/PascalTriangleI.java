package Easy;

import java.util.ArrayList;
import java.util.List;
/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:                                                          Example 2:
Input: numRows = 5                                                  Input: numRows = 1
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]                   Output: [[1]]

Constraints : 1 <= numRows <= 30
 */

public class PascalTriangleI {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<List<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> pascalElement = new ArrayList<>(i);
            while(pascalElement.size()<=i) pascalElement.add(1);
            int mid = i/2;
            for(int j=1;j<=mid;j++){
                int val = pascal.get(i-1).get(j-1)+ pascal.get(i-1).get(j);
                pascalElement.set(j, val);
                pascalElement.set(pascalElement.size()-j-1, val);
            }
            pascal.add(pascalElement);
        }
        return pascal;
    }
}
