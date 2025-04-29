#include<iostream>

using namespace std;

int main() {
	
	float compra, porcentaje, final;
	
	cout<<"ingrese el total de su compra: ";
	cin>>porcentaje;
	
	compra = porcentaje*15/100;
	final = porcentaje-compra;
	
	cout<<"su compra tuvo un descuento de: "<<compra;
	
	cout<<"\nen total debe pagar: "<<final;
	
	return 0;
}
