#include<iostream>
#include<string.h>

using namespace std;

main() {
	
	string nom;
	int compra, monto, descuento, total;
	char nombre[10];
	
	cout<<"ingrese total de la compra: ";
	cin>>compra;
	cout<<"ingrese nombre del cliente: ";
	cin>>nom;
	gets(nombre);
	
	if(strcmpi(nombre,"federico")==0) {
		
	cout<<"usted tiene descuento"<<endl;
		
	monto=compra;
	descuento=monto*10/100;
	total=monto-descuento;
	
	cout<<"nombre del cliente: federico"<<endl;
	cout<<"monto de la compra: "<<monto<<endl;
	cout<<"descuento: "<<descuento<<endl;
	cout<<"total a pagar: "<<total;
		
	}
	else {
		
		cout<<"usted no tiene descuento"<<endl;
		
	monto=compra;
	descuento=0;
	total=monto-descuento;
	
	cout<<"nombre del cliente: "<<nom<<endl;
	cout<<"monto de la compra: "<<monto<<endl;
	cout<<"descuento: "<<descuento<<endl;
	cout<<"total a pagar: "<<total;
	
	}
	
	return 0;
}
