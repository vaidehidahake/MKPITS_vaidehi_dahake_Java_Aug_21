//4 -example of union displaying corrupted values of i an j 
union data
{
	int i;
	float j;
	char name[20];
};
int main()
{
	union data d1;
	printf("\n memory required to store data=%d databytes",sizeof(d1));
	d1.i=10;
//	printf("\n value of i=%d",d1.i);
	d1.j=27.90f;
//	printf("\n value of j=%f",d1.j);
	strcpy(d1.name,"vaidehi");
	printf("\n value of i=%d",d1.i);
	printf("\n value of j=%f",d1.j);
	printf("\n name=%s",d1.name);

}
