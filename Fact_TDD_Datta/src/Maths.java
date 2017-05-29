
public class Maths {
	
	
	public int getFact(int num)
	{
		
		if(num==0)
		{
			return 1;
		}
		
		if(num==1)
		{
			return 1;
					
		}
		
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		
		if(num>1)
		{
			 int fact=1, i;  
			 for(i=1;i<=num;i++){    
			      fact=fact*i;    
			  }    
			  return fact;   
		}  
		
				return 1;
	}

}
