//Programmer: Emmanuel Aguirre
//HW: Wk12
//Class: Cmpr112
//File: Dice.java

public class Dice
{
 int value;
 int myBounces;
 
 public Dice(int bounces)
 {
  value = -1;
  myBounces = bounces;
 }
 
 public int Throw()
 {
  int avg=0;
  for(int i = myBounces; i > 0; i--)
   avg += (1 + (int) (Math.random() * 6));
  
  avg/=myBounces;
  
  value = avg;
  return value;
 }
 
 public int Value()
 {
  return value;
 }
}

//-- end of Dice.java
