#include<iostream>

using namespace std;

main() {
	
	float precio, total;
	int cant, cont=0;
	char continua='s';
	
	do {
		
		cout<<"\ningrese precio: ";
		cin>>precio;
		cout<<"ingrese cantidad: ";
		cin>>cant;
		
		total=precio*cant;
		
		cout<<"total a pagar: "<<total;
		cont++;
		
	} while(cont<5);
	
	return 0;
}
