package Set1;

/*

32. **Finding the Median of an Array**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Sorting  
    **Description**: Write a program to find the median of an array of numbers.  
    **Example**:  
    Input: `array = [3, 1, 2, 4, 5]`  
    Output: `3`  
    Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3. 
 */
public class program32 {
    public static void main(String[] args) {
        int arr[]={3,2,1,4,5};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[arr.length/2]);
        
    }
}
