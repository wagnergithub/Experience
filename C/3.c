// temperature converter C to F
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int main(void){

float tempc = -15.0;
int i;
printf("Celsius\t     Fahrenheit\n");
for(i= 0;i < 46;i++){
float tempf = tempc * 9 ;
tempf = tempf / 5 ;
tempf = tempf + 32 ;
printf("%.01f \t\t %.01f \n",tempc,tempf);
tempc++;

}
float scanned;
printf("Type any number to convert: \n");
scanf("%f",&scanned);
scanned *= 9;
scanned /= 5;
scanned += 32;
printf("%.02f is the number\n\n",scanned);

printf("Press random key\n");
getch();
return 0;
}