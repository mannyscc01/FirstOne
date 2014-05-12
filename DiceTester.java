//Programmer: Emmanuel Aguirre
//HW: Wk12
//Class: Cmpr112
//File: DiceTester.java

public class DiceTester
{
    public static void main(String[]args)
    {
        Dice single = new Dice(1);
        TripleDice triple = new TripleDice(1);
        
        System.out.println("Single Dice: " + single.Throw());
        System.out.println("Triple Dice: " + triple.Throw());
    
        System.exit(0);
    }
}

//-- end of DiceTester.java