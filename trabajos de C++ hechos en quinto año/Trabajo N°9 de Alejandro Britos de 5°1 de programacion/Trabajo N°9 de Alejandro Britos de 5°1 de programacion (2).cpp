#include<iostream>
#include<conio.h>

using namespace std;

int main() {
	
	float compra, monto, descuento, final;
	int opcion;
	
	cout<<"ingresar el monto a pagar: ";
	cin>>compra;
	
	cout<<"1- pagar con tarjeta de debito"<<endl;
	cout<<"2- pagar con otro medio de pago"<<endl;
	cout<<"ingrese opcion: ";
	cin>>opcion;
	
	switch(opcion) {
		case 1: {
			monto=compra;
			descuento=compra*20/100;
			final=compra-descuento;
			break;
		}
		case 2: {
			monto=compra;
			descuento=0;
			final=compra+0;
			break;
		}
		default: {
			cout<<"opcion incorrecta";
			break;
		}
	}
	
	cout<<"\nmonto inicial de la compra: "<<compra;
	cout<<"\ndescuento: "<<descuento;
	cout<<"\nmonto final: "<<final;
	
	getch();
	return 0;
}
