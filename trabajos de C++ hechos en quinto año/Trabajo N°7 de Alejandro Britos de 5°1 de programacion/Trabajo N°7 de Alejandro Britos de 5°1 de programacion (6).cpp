#include<iostream>

using namespace std;

int main() {
	
	int precio, m, d;
	
	cout<<"ponga el precio de una gaseosa: ";
	cin>>precio;
	
	m=precio*5;
	d=m/10;
	
	cout<<"cada chico debio pagar: "<<d<<"$";
	
	return 0;
}
