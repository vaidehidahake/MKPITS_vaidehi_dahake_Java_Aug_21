//13 - wap to print febonachi series

#include<stdio.h>
int main() {
 int n1=0,n2=1,n3,i,number;    
     printf("Enter the number of elements:");    
     scanf("%d",&number);     //10
     printf("\n%d %d",n1,n2);//printing 0 and 1    
     for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;     // n3 = 1 + 2 =3
      printf(" %d",n3);    
      n1=n2;    // n1 =1
      n2=n3;    //n2 = 2
     }  
      return 0;  

