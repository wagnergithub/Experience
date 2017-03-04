#include<stdio.h>
#include<conio.h>
#include<string.h>

int main(){
char psswrd[10];
printf("Enter password:\n");
scanf("%s",psswrd);
if (strcmp(psswrd, "s3#!") == 0)
printf("Correct password\n");
else printf("Access denied\n");


getch();
return 0;
}