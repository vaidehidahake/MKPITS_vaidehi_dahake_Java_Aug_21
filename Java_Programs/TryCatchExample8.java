// we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).
    public class TryCatchExample8 
    {  
      
        public static void main(String[] args) 
        {  
            try  
            {  
            int data=50/0; //may throw exception   
      
            }  
                 
            catch(ArrayIndexOutOfBoundsException e)  
            {  
                System.out.println(e);  
            }  
            System.out.println("rest of the code");  
        }  
          
    }  
