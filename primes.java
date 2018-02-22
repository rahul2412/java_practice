class primes{  
    public static void main(String args[]){  
     System.out.println("Prime no. program-"); 
     int i,j,k,l,m,n;
     int flag;
     int count=1;
System.out.println("1.  1"); 
     
     for(i=2;i<1000;i++) 
     {
     flag=0;
     
     for(j=2;j<i;j++)
     {
     if(i%j==0)
     {
     flag=1;
     break;
     }


     }
     if(flag==0)
          {System.out.println(count+1+".  "+i);
          count++;
if(count==100)
break;
         

     }
}
    }  
}  