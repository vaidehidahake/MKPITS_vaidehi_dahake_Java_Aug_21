//7- create a union customer with member custid(int) , custname(char array) , mobileno(double).
union customer
{
	int custid;
	char custname[20];
	double mobno;
}c1;
int main()
{
	printf("\n enter customer id :");
	scanf("%d",&c1.custid);
	printf("\n value of id =%d",c1.custid);
	printf("\n enter customer name :");
	scanf("%s",&c1.custname);
	printf("\n name =%s",c1.custname);
	printf("\n enter mobile number :");
	scanf("%lf",&c1.mobno);
	printf("\n mobno =%.0lf",c1.mobno);
	printf("\n name =%s",c1.custname);
	
}
