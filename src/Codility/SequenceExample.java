package Codility;
// comments
public class SequenceExample {

	 public static void main(String args[]) {
	      int x=10;
	      int arr[]=new int[]{1, 1, 0, 1, 1};
	      boolean flag=false;
	      int pos=0;
	      int value=0;
	      int count=0;
	      int hh=12;
	       for (int i = 0; i < arr.length-1; i++){
	           System.out.println(" arr[ "+i+" ] *****  "+arr[i] );
	           if((arr[i]==0 & arr[i+1]==1) || (arr[i]==1 & arr[i+1]==0)){
	           continue;
	           }
	           else
	           {
	               flag=true;
	               pos=i;
	               value=arr[i];
	               break;
	           }
	       }
	       
	       for (int i = 0; i < arr.length-1; i++){
		        if(flag == true & pos==i)
		        {	            
		        	 count++;
		            if(arr[pos] == 1){
		            if(arr[pos+1] == 1){
		            arr[pos+1]=0;
		           
		            System.out.println(" inside *****&&&  1 0" );
		            System.out.println(" inside *****&&&  1 0 count "+count );
		            }
		            }
		            else
		            {
		            System.out.println(" inside *****&&&  0 1" );
		            if(arr[pos+1] == 0){
		            arr[pos+1]=1;
		            
		            System.out.println(" inside *****  01" );
		            System.out.println(" inside *****  01 count "+count );
		            }       
		            
		            
		        }
		        }
		    }
	    
	    for (int i = 0; i < arr.length-2; i++){
	        if(flag == true & pos==i)
	        {
	           
	            if(arr[pos] == 1){
	           
	            if(arr[pos+2] == 1){
	            arr[pos+1]=0;
	            count++;
	            System.out.println(" inside *****  1" );
	            System.out.println(" inside *****  1 count "+count );
	            }
	           else
	            {
	                arr[pos]=0;
	                arr[pos+1]=1;
	                
	            }
	           
	            }
	            else
	            {
	             
	             System.out.println(" inside *****  0" );
	             System.out.println(" inside *****  0 count "+count );
	            if(arr[pos+2] == 0){
	            arr[pos+1]=1;
	            count++;
	            System.out.println(" inside *****  01" );
	            }
	               else
	            {
	                arr[pos]=1;
	                arr[pos+1]=0;
	                
	                 System.out.println(" inside *****  10" );
	                 System.out.println(" inside *****  10 count "+count );
	            }
	            
	            }
	            break;
	        }
	    }
	    
	   
	    
	    
	    for (int i =arr.length-1; i >=arr.length -2 ; i--){
	       
	         if( arr[i]==1 && arr[i-1] ==1)
	        {
	            count++;	           
	        
	                arr[i]=0;
	                arr[i-1]=1;
	             System.out.println(" inside 10" );
	            
	        }
	            else if( arr[i]==0 && arr[i-1] ==0)
	            {
	            	count++;
	                arr[i]=1;
	                arr[i-1]=0;
	                 System.out.println(" inside &&&& 01" );
	            }
	            
	         
	        }
	    
	    
	    
	    System.out.println(" pos , value=  " +pos+"  "+ value);
	       for (int i = 0; i < arr.length; i++){
	      System.out.println(arr[i] );
	       }
	        System.out.println("\n"+count +" count");
	       
	    }
}
