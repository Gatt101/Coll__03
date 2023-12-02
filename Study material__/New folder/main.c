#include <stdio.h>
#include <stdlib.h>
#define max 6
int top = -1, a[max];
void push()
{
int x;
if (top == max - 1)
{ printf("stack overflow condition");
} else
{ printf("enter element to the stack\n"); scanf("%d", &x); top++; a[top] = x;
}
 }
void display()
{ int i;
for (i = top; i >= 0; i--)
{ printf("%d\n",a[i]);
}
}
 void pop()
{ if (top == -1)
{ printf("stack underflow condition\n");
}
else
{ printf("pop element:%d\n", a[top]);
top--;
}
}
int main()
{ int ch;
while (1)
{ printf("enter your choice\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
scanf("%d", &ch);
switch (ch)
{ case 1: push(); break;
case 2: pop(); break;
 case 3:
display(); break;
case 4:
exit(0); break;
default:
    printf("invlaid choice\n"); break;
}
} return 0;
}
