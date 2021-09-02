//5 - create a structure book and create 2 structure variable b1 and b2
struct book
{
	int bookid;
	char title[10];
	char author[10];
	float price;
	
}b1,b2;
int main()
{
	printf("\n first book details \n");
	b1.bookid=111;
	strcpy(b1.title,"narnia");
	strcpy(b1.author,"john burg");
	b1.price=112.0f;
	printf("\n bookid=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author name=%s",b1.author);
	printf("\n price=%f",b1.price);
	printf("\n");
	printf("\n second book details \n");
	b2.bookid=112;
	strcpy(b2.title,"tiger");
	strcpy(b2.author,"smith johns");
	b2.price=445.0f;
	printf("\n bookid=%d",b2.bookid);
	printf("\n title=%s",b2.title);
	printf("\n author name=%s",b2.author);
	printf("\n price=%f",b2.price);
}
	

