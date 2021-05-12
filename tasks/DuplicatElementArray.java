package tasks;

public class DuplicatElementArray {
	public static void main(String[] args) {      
        
        int [] arr = {11,24,3,2,44,44,55,55};   
          
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  

}
