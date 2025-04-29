#include<iostream>
#include<stdlib.h>

using namespace std;

int main() 
{
	
	cout<<"1) Habitacion simple ($1.000)"
	"\n2) habitacion para dos camas separadas ($1.800)"
	"\n3) habitacion para tres camas separadas ($2.500)"
	"\n4) habitacion matrimonial ($2.000)"
	"\n5) habitacion para 4 con una cama matrimonial y 2 camas separadas ($3.000)"<<endl;
        
	int habitaciones;
	cout << "ingrese numero de la habitacion: "; 
	cin >> habitaciones;
	switch (habitaciones) {
		case 1:
			cout<<"habitacion simple";
			break;
		case 2:
			cout<<"habitacion para dos camas separadas";
			break;
		case 3:
			cout<<"habitacion para tres camas separadas";
			break;
		case 4:
			cout<<"habitacion matrimonial";
			break;
		case 5:
			cout<<"habitacion para 4 con una cama matrimonial y 2 camas separadas";
			break;
		default:
        	cout<<"habitacion no disponible";	
}
	int numero;
	
	cout<< "\nponga el numero de la habitacion para agrgar al carro: "<<endl;
	cin>>numero;

	switch(numero){
		case 1: cout<<"usted digito el numero de la primera habitacion"; break;
		case 2: cout<<"usted digito el numero de la segunga habitacion"; break;
		case 3: cout<<"usted digito el numero de la tercera habitacion"; break;
		case 4: cout<<"usted digito el numero de la cuarta habitacion"; break;
		case 5: cout<<"usted digito el numero de la quinta habitacion"; break;
		default: cout<<"habitacion no disponible"; break;
	}
	char nombre[50];
	char DNI[30];
	int  tarjeta;
	
	cout<<"\ndigite su nombre: "; cin>>nombre;
	cout<<"digite su DNI: "; cin>>DNI;
	cout<<"digite su numero de tarjeta de credito: "; cin>>tarjeta;
	
	return 0;
}
