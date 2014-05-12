//Programmer: Emmanuel Aguirre
//HW: Wk12
//Class: Cmpr112
//File: TripleDice.java

public class TripleDice extends Dice
{
    int value;
    int myBounces;
    
    public TripleDice(int bounces)
    {
        super(bounces);
    }
    
    @Override
    public int Throw()
    {
        int avg=0;
        for(int i = 0; i<3; i++)
        {
            //int tempThrow = super.Throw();
            //System.out.println("Dice " + (i+1) +": " + tempThrow);
            //avg += tempThrow;
            
            avg+=super.Throw();
        }
        
        avg/=3;
        
        value = avg;
        return value;
    }
    
    public int value()
    {
        return value;
    }
    
    
}

//-- end of TripleDice.java