#include<iostream>

using namespace std;

main() {
	
	int precio, cantidad, descuento, total, total_2, d=0;
	
	do {
		
		cout<<"\ningrese el precio del producto: ";
		cin>>precio;
		cout<<"ingrese cantidad del producto: ";
		cin>>cantidad;
	
		total=precio*cantidad;
	
		if(total>2500) {
			d=d+1;
			descuento=total*6/100;
			total_2=total-descuento;
			cout<<"total a pagar: "<<total_2;
			cout<<"\nventas con descuento: "<<d;
		
		}
		else {
			cout<<"total a pagar: "<<total;
		
		}
		
	} while(cantidad!=0);
	
}
