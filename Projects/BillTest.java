//Problem Statement:
//You need to calculate the electricity bill based on the below parameters
// Input parameters will be
       // Usage in units
    //The bill will be calculated as per below slab
       // 0-100 units (Rs. 3.44 per unit)
       // 101-300 units (Rs. 7.34 per unit)
       // 301-500 units (Rs. 10.36 per unit)
        //501-1000 units (Rs. 11.82 per unit)
        //>1000 units (Rs. 11.82 per unit)
    //Apart from the above slab, there are few fixed costs added to each bill as below
        //Mandatory Cost: Rs. 200
        //Vehicle Cost @ 1.38 per unit
        //Tax @ 16% on total cost
import java.util.*;
class Electricity
{
    double cost;
    double mandatoryCost=200;
    double vehicleCost;
    double tax;
    double totalCost;

    void CalculateBill(int unit)
    {
       if(unit<=100)
       {
          cost=unit*3.44;
        }
        else if(unit>101 && unit<=300)
        {
           cost=unit*7.34;
        }
        else if(unit>301 && unit<=500)
        {
          cost=unit*10.36;
        }
        else if(unit>501 && unit<=1000)
		        {
		          cost=unit*11.82;
        }
        else if(unit>1000)
        {
        cost=unit*11.82;
        }
        System.out.println("The Electricity Bill of Consumer is:");
        vehicleCost=unit*1.38;
        totalCost= cost+vehicleCost+mandatoryCost;
        tax=totalCost*0.16;
        totalCost=totalCost+tax;
        System.out.println(" vehicleCost is 1.38 per unit="+ vehicleCost);
        System.out.println(" tax is 16% on totalcost ="+ tax);
        System.out.println(" Total Electricity Bill Amount is ="+ totalCost);

     }

 }

 class BillTest
 {
    public static void main(String[] args)
    {
        Electricity e1=new Electricity();
        Scanner scan=new  Scanner(System.in);
        System.out.println("enter unit:");
        int unit=scan.nextInt();
        e1.CalculateBill(unit);

     }
  }