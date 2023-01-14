package HashTable;

/**
 *
 * @author Ahdessa Perez
 */
public class Main_Perez_Ahdessa {
    public static void main(String[] args) { 
        int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 }; 
 
        //insert loop to convert numsToAdd elements to hashed values by calling hash() function (1 pt) 
        for(int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        
        //insert loop to display the hashed values (1pt) 
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    } 

    //Method for hashing (1pt)
    public static int hash(int value) { 
        return Math.abs(value % 10);
    }
}
