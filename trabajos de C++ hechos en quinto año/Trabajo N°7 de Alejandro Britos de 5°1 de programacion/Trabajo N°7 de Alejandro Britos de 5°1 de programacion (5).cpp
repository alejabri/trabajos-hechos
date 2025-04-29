#include<iostream>

using namespace std;

int main() {
	
	int luz, iva, suma;
	
	cout<<"ingrese cuanto deb de luz: ";
	cin>>luz;
	
	iva=luz/100*21;
	suma=luz+iva;
	
	cout<<"lo que debe pagar con impuesto de IVA es: "<<suma<<"$";
	
	return 0;
}
