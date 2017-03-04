#include <stdio.h>
#include <stdlib.h>
#include<string.h>

int main(){

char name[20];

printf("Type your name:\n");
scanf("%s",name);
printName();

return 0;
getch();
}


void printName(){
printf("Hello %s",name);
}