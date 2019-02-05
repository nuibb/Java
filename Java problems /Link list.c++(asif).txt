#include<stdio.h>
#include<malloc.h>
struct node
{
	int num;
	node *next;
};
struct node *head,*curr,*temp,*prev,*last;
void create()
{
	int i,n;
	printf("enter the no. of node to create\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		curr = (struct node*)malloc(sizeof(struct node));
		scanf("%d",&curr->num);
		curr->next=NULL;
		if(head!=NULL)
		{
			temp->next=curr;
			temp = temp->next;
			temp->next=NULL;
	//		printf("%d->",temp->num);
		}
		else
		{
			head = curr;
			temp = curr;
			head->next=NULL;
		}
	}
}
void insert()
{
	int pos,c=1;
	curr = (struct node*)malloc(sizeof(struct node));
	printf("enter the no.\n");
	scanf("%d",&curr->num);
	printf("enter the position to be inserted\n");
	scanf("%d",&pos);
	if(pos==1)
	{
		curr->next = head;
		head = curr;
	}
	else
	{
		temp = head;
		while(c<pos)
		{
			prev = temp;
			temp = temp->next;
			c++;
		}
		curr->next = temp;
		prev->next = curr;
	}
}
void dlete()
{
	int c=1,d;
	printf("enter the no. of pos to be deleted\n");
	scanf("%d",&d);
	temp = head;
	if(d==1)
	{
		head = temp->next;
		temp->next=NULL;
		free(temp);
	}
	else
	{
		while(c<d)
		{
			prev = temp;
			temp = temp->next;
			last = temp->next;
			c++;
		}
		prev->next = temp->next;
		temp->next=NULL;
		free(temp);

	}
}
void display()
{
	curr = head;
	while(curr!=NULL)
	{
		printf("%d->",curr->num);
		curr= curr->next;
	}
	printf("\n");
}
int main()
{
	char ch;
	while(1)
	{
		printf("command?\n");
		scanf("%c",&ch);
		if(ch=='c')
			create();
		else if(ch=='i')
			insert();
		else if(ch=='D')
			dlete();
		else if(ch=='d')
			display();
		else 
			printf("Invalid command\n");
		getchar();
	}
	return 0;
}