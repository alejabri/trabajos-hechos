/*es un algoritmo que solicita el ingreso por teclado los datos de temperatura para cada dia del año*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	float dias,suma_dias=0,dias_media;
	float dias_alta=0,dias_baja=999;
	float temperatura,suma_temperatura=0,temperatura_media;
	float temperatura_alta=0,temperatura_baja=999;
	
	for(int t=1;t<365;t+=1){
		cout<<"temperatura de los dias"<<t<<": ";
		cin>>dias;
		
		suma_dias += dias;
	
}
	
	for(int i=0;i<24;i+=1){
		cout<<"Digite la temperatura a las "<<i<<": ";
		cin>>temperatura;
		
		suma_temperatura += temperatura;
		
}
	
	getch();
	return 0;
}
