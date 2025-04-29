#include<iostream>

using namespace std;

int main() {
	
	int chica, grande, mult, m, suma;
	
	cout<<"ingrese el precio de una bolsa chica de comida para perro: ";
	cin>>chica;
	
	cout<<"ingrese el precio de una bolsa grande de comida para perro: ";
	cin>>grande;
	
	mult=chica*4;
	m=grande*3;
	suma=mult+m;
	
	cout<<"lo que gasta por mes es: "<<suma<<"$";	
	
	return 0;
}
