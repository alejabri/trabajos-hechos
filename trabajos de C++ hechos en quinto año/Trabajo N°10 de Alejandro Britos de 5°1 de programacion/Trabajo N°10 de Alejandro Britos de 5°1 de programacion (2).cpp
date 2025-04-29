#include<iostream>
#include<string.h>

using namespace std;

main() {
	
	int compra, cuotas, monto, cantidad, total, precio, monto2;

	cout<<"ingrese monto de la compra: ";
	cin>>compra;
	cout<<"ingrese cantidad de cuotas: ";
	cin>>cuotas;
	
	if(cuotas <= 3) {
		
		monto=compra;
		cantidad=cuotas;
		total=monto;
		precio=compra/cuotas;
		
		cout<<"monto de la compra: "<<monto<<endl;
		cout<<"cantidad de cuotas: "<<cantidad<<endl;
		cout<<"total a pagar: "<<total<<endl;
		cout<<"precio de cada cuota: "<<precio;
	}
	else {
		
		monto=compra;
		monto2=monto*20/100;
		cantidad=cuotas;
		total=monto+monto2;
		precio=compra/cuotas+monto2/cantidad;
		
		cout<<"monto de la compra: "<<monto<<endl;
		cout<<"cantidad de cuotas: "<<cantidad<<endl;
		cout<<"total a pagar: "<<total<<endl;
		cout<<"precio de cada cuota: "<<precio;
		
	}
	
	return 0;
}
