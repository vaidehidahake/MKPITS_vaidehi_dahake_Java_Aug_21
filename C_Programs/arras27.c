//27-create a function to calculate area and circ. of a circle.
void calarea()
{
	int r;
	float area;
	printf("\n enter radius :");
	scanf("%d",&r);
	area=3.14f*r*r;
	printf("\narea of circle =%f",area);
}
int main()
{
	calarea();
	printf("\nBye");
}																							
