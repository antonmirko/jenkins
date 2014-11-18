package firststep;
import java.util.Scanner;
public class Hello {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Geben Sie bitte eine Zahl ein: ");
		String l = in.nextLine();
		int y = Integer.parseInt(l);
		if ( y>0)
		{
		if (y<=1000000)
		{
			l = String.valueOf(y);
		    int[] num = new int[l.length()];

			    for (int i = 0; i < l.length(); i++){
			        num[i] = l.charAt(i)-'0';
			    }
			    int res = 1;
			    for (int i=0;i<l.length();i++)
			    {
			      res=res*num[i];
			    }
			    if ( l.length()==7 )
			    	System.out.print(l+"="+num[0]+"*"+num[1]+"*"+num[2]+"*"+num[3]+"*"+num[4]+"*"+num[5]+"*"+num[6]+"="+res+"\n");
			    if ( l.length()==6 )
System.out.print(l+"="+num[0]+"*"+num[1]+"*"+num[2]+"*"+num[3]+"*"+num[4]+"*"+num[5]+"="+res+"\n");
			    if ( l.length()==5 )
System.out.print(l+"="+num[0]+"*"+num[1]+"*"+num[2]+"*"+num[3]+"*"+num[4]+"="+res+"\n");
			    if ( l.length()==4 )
System.out.print(l+"="+num[0]+"*"+num[1]+"*"+num[2]+"*"+num[3]+"="+res+"\n");
			    if ( l.length()==3 )
System.out.print(l+"="+num[0]+"*"+num[1]+"*"+num[2]+"="+res+"\n");
			    if ( l.length()==2 )
System.out.print(l+"="+num[0]+"*"+num[1]+"="+res+"\n");
			    if ( l.length()==1 )
System.out.print(l+"="+num[0]+"="+res+"\n");
          if ((res<=1000000)&&(res>0))
          {
        	 
        	 String h=String.valueOf(res);
		    int[] num1 = new int[h.length()];

			    for (int i = 0; i < h.length(); i++){
			        num1[i] = h.charAt(i)-'0';
			    }
			    int res1 = 1;
			    for (int i=0;i<h.length();i++)
			    {
			      res1=res1*num1[i];
			    }
			    
			    if ( h.length()==6 )
System.out.print(h+"="+num1[0]+"*"+num1[1]+"*"+num1[2]+"*"+num1[3]+"*"+num1[4]+"*"+num1[5]+"="+res1+"\n");
			    if ( h.length()==5 )
System.out.print(h+"="+num1[0]+"*"+num1[1]+"*"+num1[2]+"*"+num1[3]+"*"+num1[4]+"="+res1+"\n");
			    if ( h.length()==4 )
System.out.print(h+"="+num1[0]+"*"+num1[1]+"*"+num1[2]+"*"+num1[3]+"="+res1+"\n");
			    if ( h.length()==3 )
System.out.print(h+"="+num1[0]+"*"+num1[1]+"*"+num1[2]+"="+res1+"\n");
			    if ( h.length()==2 )
System.out.print(h+"="+num1[0]+"*"+num1[1]+"="+res1+"\n");
			    if ( h.length()==1 )
System.out.print(h+"="+num1[0]+"="+res1+"\n");
			    if ((res1<=1000000)&&(res1>0))
		          {
		        	 
		        	 String h1=String.valueOf(res1);
				    int[] num2 = new int[h1.length()];

					    for (int i = 0; i < h1.length(); i++){
					        num2[i] = h1.charAt(i)-'0';
					    }
					    int res2 = 1;
					    for (int i=0;i<h1.length();i++)
					    {
					      res2=res2*num2[i];
					    }
						if ( h1.length()==3 )
		System.out.print(h1+"="+num2[0]+"*"+num2[1]+"*"+num2[2]+"="+res2+"\n");
					    if ( h1.length()==2 )
		System.out.print(h1+"="+num2[0]+"*"+num2[1]+"="+res2+"\n");
					    if ( h1.length()==1 )
		System.out.print(h1+"="+num2[0]+"="+res2+"\n");

		          }
          }
          }
		else
		{
			System.out.print("FEHLER – Zahl ist ungueltig.");
		}
		}
		else
	System.out.print("FEHLER – Zahl ist ungueltig.");
}
}




	



