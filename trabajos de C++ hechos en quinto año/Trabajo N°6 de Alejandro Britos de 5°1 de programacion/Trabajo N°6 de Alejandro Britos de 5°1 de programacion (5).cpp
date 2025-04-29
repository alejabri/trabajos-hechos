#include<iostream>

using namespace std;

int main() {
	
	float compra, porcentaje, final;
	
	cout<<"ingrese el precio del articulo: ";
	cin>>porcentaje;
	
	compra = porcentaje*30/100;
	final = porcentaje+compra;
	
	cout<<"su venta tendria un aumento de: "<<compra;
	
	cout<<"\nen total seria: "<<final;
	
	return 0;
}
