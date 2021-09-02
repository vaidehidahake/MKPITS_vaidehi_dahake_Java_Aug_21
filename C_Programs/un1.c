//1- create a union data with 3 member (int i, float j, char n[10])
union data
{
	int i;
	float j;
	char name[20];
}d1;
int main()
{
	d1.i=10;
	printf("\n value of i=%d",d1.i);
	d1.j=27.90f;
	printf("\n value of j=%f",d1.j);
	strcpy(d1.name,"vaidehi");
	printf("\n name=%s",d1.name);
	printf("\n value of i=%d",d1.i);
}
