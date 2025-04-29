#include<iostream>

using namespace std;

main() {
	
	float precio, total;
	int cant;
	
	cout<<"ingrese precio: ";
	cin>>precio;
	cout<<"ingrese cantidad: ";
	cin>>cant;
	
	do {
		
		total=precio*cant;
		cout<<"total a pagar: "<<total;
		cout<<"\ningrese precio: ";
		cin>>precio;
		cout<<"ingrese cantidad: ";
		cin>>cant;
		
	} while(precio>0 || cant>0);
	
	return 0;
}
