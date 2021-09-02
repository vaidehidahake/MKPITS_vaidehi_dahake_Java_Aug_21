//4- create a structure product with productid,productname,productprice.
struct product
{
	int prodid;
	char prodname[20];
	float price;
}p1;
int main()
{
	printf("\n enter product id :");
	scanf("%d",&p1.prodid);
	printf("\n product id =%d",p1.prodid);
	printf("\n enter product name :");
	scanf("%s",&p1.prodname);
	printf("\n product name =%s",p1.prodname);
	printf("\n enter product price :");
	scanf("%f",&p1.price);
	printf("\n product price =%f",p1.price);
}
