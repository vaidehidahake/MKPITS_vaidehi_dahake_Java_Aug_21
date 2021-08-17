#include<stdio.h>
int main()
{
	int bs1,bs2,bs3;
	float hra,da,ts;
	printf("enter three employees basic salary");
	scanf("%d%d%d",&bs1,&bs2,&bs3);
	hra=0.25f*bs1*bs2*bs3;
	da=0.35f*bs1*bs2*bs3;
	ts=hra+da+(bs1+bs2+bs3);
printf("\nhra=%.2f",hra);
printf("\nda=%.2f",da);
printf("\nts=%.2f",ts);
		
	
}
