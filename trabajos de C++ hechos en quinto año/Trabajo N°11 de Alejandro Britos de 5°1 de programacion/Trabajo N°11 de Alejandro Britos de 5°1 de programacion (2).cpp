#include<iostream>

using namespace std;

main() {
	
	int precio, productos, total, total2, descuento;
	
	cout<<"\ningrese precio: ";
	cin>>precio;
	cout<<"cantidad de productos: ";
	cin>>productos;
	
	total=precio*productos;
	
	while(total>0) {
	
		if(total>2000) {
			
			descuento=total*10/100;
			total2=total-descuento;
		
			cout<<"\ntotal a pagar con descuento: "<<total2<<endl;
			
		}
		
		cout<<"\ningrese precio: ";
		cin>>precio;
		cout<<"cantidad de productos: ";
		cin>>productos;
		
		total=precio*productos;
		
		cout<<"total a pagar: "<<total;
		
	}

	return 0;	
}
