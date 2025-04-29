/*es un algoritmo que solicita el ingreso por teclado los datos de temperatura cada hora y durante un solo dia*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	float temperatura,suma_temperatura=0,temperatura_media;
	float temperatura_alta=0,temperatura_baja=999;
	
	for(int i=0;i<24;i+=1){ 
		cout<<"Digite la temperatura a las "<<i<<": ";
		cin>>temperatura;
		
		suma_temperatura += temperatura;
		
	}	
	
	getch();
	return 0;
}
