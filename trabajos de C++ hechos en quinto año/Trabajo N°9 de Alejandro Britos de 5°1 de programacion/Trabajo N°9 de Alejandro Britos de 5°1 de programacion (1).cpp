#include<iostream>
#include<conio.h>

using namespace std;

int main() {
	
	float compra, monto, descuento, final;
	int opcion;
	
	cout<<"ingrese el importe a abonar: ";
	cin>>compra;
	
	cout<<"1- pagar en efectivo"<<endl;
	cout<<"2- pagar con tarjeta"<<endl;
	cout<<"ingrese opcion: ";
	cin>>opcion;
	
	switch(opcion) {
		case 1: {
			monto=compra;
			descuento=compra*5/100;
			final=compra-descuento;
			break;
		}
		case 2: {
			monto=compra;
			descuento=compra*10/100;
			final=compra+descuento;
			break;
		}
		default: {
			cout<<"opcion incorrecta";
			break;
		}
			
	}
	cout<<"\nmonto inicial de la compra: "<<compra;
	cout<<"\ndescuento o recargo: "<<descuento;
	cout<<"\nmonto final: "<<final;
	
	getch();
	return 0;
}
