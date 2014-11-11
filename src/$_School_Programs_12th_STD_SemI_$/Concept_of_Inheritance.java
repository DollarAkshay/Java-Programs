
package $_School_Programs_12th_STD_SemI_$;


//Super-Class
public class Concept_of_Inheritance {
private int x;
protected int y;
int z=9;


public Concept_of_Inheritance()
{
    
System.out.println(" Constructor of Super Class\n");
z=0;
}

}


//Sub-Class
class sub_class extends Concept_of_Inheritance{
private int x;

sub_class()
{
System.out.println("Constructor of Sub-Class\n");
System.out.println("Value of z = "+z);
}

public static void main(String args[]) 
{
int n = 65;
char c = (char) n;

System.out.println(c);
}

}


