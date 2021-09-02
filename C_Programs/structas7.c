//13 - create a structure array of 10 element of struture product.
//12 - create a structure array of 5 elements of structure book .
struct product 
{
	int prodid;
	char pname[20];
	float price;
};

void display(struct product pro1);
#include<stdio.h>
int main() 
{
struct	product pro1[10]; 
int i=0;
while(i<10 )
{
printf("\nenter product id : ");
scanf("%d",&pro1[i].prodid);
printf("enter product name : ");
scanf("%s",&pro1[i].pname);
printf("enter product price :");
scanf("%f",&pro1[i].price);
printf("\nproduct[%d] details are",i+1);
display(pro1[i]); 
i++;
}

}
void display(struct product pro1)
{
	printf("\n product id = %d",pro1.prodid);
printf("\n product name = %s",pro1.pname);
printf("\n product price =%f",pro1.price);

}

