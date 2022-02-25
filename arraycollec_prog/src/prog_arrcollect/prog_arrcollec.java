package prog_arrcollect;


	
		import java.util.Arrays;
		import java.util.ArrayList;
		import java.util.Arrays;
		 
		
		import java.util.*;
		 
		public class prog_arrcollec {
		 
		    
		    public static void main(String[] args)
		    {
		 
		        
		        List<String> list = new ArrayList<String>();
		       
		        
		        list.add("the place");
		        list.add("is");
		        list.add("too ");
		        list.add("far");
		        list.add("here");
		        list.add("to travel");
		 
		     
		        String[] str = list.toArray(new String[0]);
		 
		      for (int i = 0; i < str.length; i++) {
		            String data = str[i];
		 
		     
		            System.out.print(data);
		        }
		    }
		
	}


