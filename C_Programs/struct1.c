//1- create a structure book with members bookid, title, author and price.
struct book
{
	int bookid;
	char title[10];
	char author[10];
	float price;
	
};
int main()
{
	struct book b1;
	b1.bookid=111;
	strcpy(b1.title,"narnia");
	strcpy(b1.author,"john burg");
	b1.price=112.0f;
	printf("\n bookid=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author name=%s",b1.author);
	printf("\n price=%f",b1.price);
}
	

