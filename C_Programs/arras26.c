//26-create a function to calculate area of rectangle.
void calarea()
{
	int l,b,area;
	printf("enter length and breadth :");
	scanf("%d%d",&l,&b);
	area=l*b;
	printf("\narea of rectangle=%d",area);
}
int main()
{
	calarea();
	printf("\nbye");
}						
