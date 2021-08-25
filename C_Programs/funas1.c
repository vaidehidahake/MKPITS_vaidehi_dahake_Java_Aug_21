//8. wap to create a function factorial with one int parameter ,
//calculate and display the factorial of that number.
void factorial(int num)
{
	int fact=1;
	while(num>0)
	{
		fact=fact*num;
		num--;
	}
	printf("\nfactorial is =%d",factorial);
}
int main()
{
	int n1;
	printf("\nenter a number :");
	scanf("%d",&n1);
	factorial(n1);
	printf("\nBye");
	
}

