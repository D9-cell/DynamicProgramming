package Easy;

import java.util.ArrayList;
import java.util.List;
/*
Given an integer rowIndex, return the rowIndex_th (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it, as shown:

Example 1:                  Example 2:                  Example 3:
Input: rowIndex = 3         Input: rowIndex = 0         Input: rowIndex = 1
Output: [1,3,3,1]           Output: [1]                 Output: [1,1]

Constraints: 0 <= rowIndex <= 33
Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 */

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> nextRow = new ArrayList<>(i);
            nextRow.add(1);
            for (int j = 1; j <= i/2; j++) {
                int val = (row.get(j - 1) + row.get(j));
                nextRow.set(j,val);
                nextRow.set(nextRow.size()-j-1,val);
            }
            row = nextRow;
        }
        return row;
    }

}
