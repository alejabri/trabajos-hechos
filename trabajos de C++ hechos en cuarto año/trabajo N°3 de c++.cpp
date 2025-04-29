#include<iostream>
#include<stdlib.h>

using namespace std;

int main() 
{	
	int habitaciones;
	cout << "ingrese numero de la habitacion: "; 
	cin >> habitaciones;
	switch (habitaciones) {
		case 1:
			cout<<"Habitación simple ($1.000)";
			break;
		case 2:
			cout<<"Habitacion con dos camas separadas ($1.800)";
			break;
		case 3:
			cout<<"Habitación con tres camas separadas ($ 2.500)";
			break;
		case 4:
			cout<<"Habitacion Matrimonial ($2000)";
			break;
		case 5:
			cout<<"Habitacion para 4 con una cama matrimonial (y dos camas de una plaza) ($ 3.000)";
			break;
        default:
        	cout<<"habitacion no disponible";
    }
    char sexo[10];
	char DNI[30];
	int edad;
	
	cout<<"digite su sexo: "; cin>>sexo;
	cout<<"digite su DNI: "; cin>>DNI;
	cout<<"digite su edad: "; cin>>edad;
	
	cout<<"\nsexo: "<<sexo<<endl;
	cout<<"DNI: "<<DNI<<endl;
	cout<<"edad: "<<edad<<endl;
	
	int numero, dato = 1;
	
	cout<<"ponga 1 para aceptar, ponga 2 para no aceptar: ";
	cin>>numero;
	
	if(numero == dato){
		cout<<"usted a aceptado";
	}
	else{
		cout<<"usted no a aceptado";
	}
	
    return 0;
}
