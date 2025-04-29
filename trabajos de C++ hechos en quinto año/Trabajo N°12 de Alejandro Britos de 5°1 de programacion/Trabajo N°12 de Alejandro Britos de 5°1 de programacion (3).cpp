#include<iostream>

using namespace std;

main() {
	
	float precio, total;
	int cant;
	char continua='s';
	
	do {
		
		cout<<"ingrese precio: ";
		cin>>precio;
		cout<<"ingrese cantidad: ";
		cin>>cant;
		
		total=precio*cant;
		
		cout<<"total a pagar: "<<total;
		cout<<"\ndesea continuar S/N: ";
		cin>>continua;
		
	} while(continua=='s' || continua=='S');
	
	return 0;
}
