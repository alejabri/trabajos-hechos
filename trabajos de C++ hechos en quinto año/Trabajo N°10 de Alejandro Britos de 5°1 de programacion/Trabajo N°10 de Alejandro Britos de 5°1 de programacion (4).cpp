#include<iostream>
#include<string.h>

using namespace std;

main() {
	
	int venta,marca2, precio, cuotas;
	char marca[10];
	
	cout<<"cantidad vendida: ";
	cin>>venta;
	cout<<"precio unitario: ";
	cin>>precio;
	cout<<"cantidad de cuotas: ";
	cin>>cuotas;
	cout<<"marca: ";
	cin>>marca2;
	gets(marca);
	
	if(strcmpi(marca,"motorola")==0) {
		
		cout<<"no hay productos disponibles";
	}
	
	return 0;
}
