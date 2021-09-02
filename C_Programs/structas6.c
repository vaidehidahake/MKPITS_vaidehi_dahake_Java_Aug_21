//12 - create a structure array of 5 elements of structure book .
struct book 
{
	int bookid;
	char title[20];
	char author[20];
	float price;
};

void display(struct book b1);
#include<stdio.h>
int main() 
{
struct	book book[5]; 
int i=0;
while(i<5 )
{
printf("\nenter book id : ");
scanf("%d",&book[i].bookid);
printf("enter book title : ");
scanf("%s",&book[i].title);
printf("enter book author : ");
scanf("%s",&book[i].author);
printf("enter book price :");
scanf("%f",&book[i].price);
printf("\nbook[%d] details are",i+1);
display(book[i]); 
i++;
}

}
void display(struct book b1)
{
	printf("\n book id = %d",b1.bookid);
printf("\n book title = %s",b1.title);
printf("\n book author = %s",b1.author);
printf("\n book price =%f",b1.price);

}

