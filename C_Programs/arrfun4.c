int main() 
{
	char prod_name[5][20]; 
	int price[5],i;
	for(i=0;i<5;i++)
	 {
			printf("enter 5 product name");
		scanf("%s",&prod_name[i]);
		printf("enter 5 product price");
		scanf("%d",&price[i]);
	
	}
	for(i=0;i<5;i++) 
	{
		printf("\n product name = %s",prod_name[i]);
	}
	calculate_price(price); 
}


void calculate_price(int pr[])
 {
	int total=0,i;
	
		for(i=0;i<5;i++)
		 {
			
			total=total + pr[i];
		}
		printf("\ntotal price of products  = %d",total);
		
	
}

