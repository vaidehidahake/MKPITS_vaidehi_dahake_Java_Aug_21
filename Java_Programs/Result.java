package mkpits1;
public class Result
{
  int phy,chem,math;
  int total;
  float per;
  String grade;
public int CalculateTotal(int m1,int m2,int m3)
{
   phy=m1;
   chem=m2;
   math=m3;
   total=m1+m2+m3;
   return total;
}
public float CalculatePercentage()
{
   per=(float)(total/300.0f)*100.0f;
   return per;
}
public String Grade()
{
   if (per>=75)
{ 
   grade="Distinction";
}
else if(per>=60 && per<75)
{
   grade="First";
}
else if(per>=50 && per<60)
{
   grade="Second";
}
else
{
   grade="Fail";
}
return grade;
}
}

