#include<iostream>

using namespace std;

main() {
	
	int i, nuevo, valor, edad[6]={21,33,27,50,9,36};
	
	for(i=0;i<6;i++) {
		cout<<edad[i]<<" ";
		
	}
	
	cout<<"\nque posicion quiere modificar del 0 al 5: ";
	cin>>nuevo;
	
	cout<<"ingrese nuevo valor: ";
	cin>>valor;
	
	edad[nuevo]=valor;
	
	for(i=0;i<6;i++) {
		cout<<edad[i]<<" ";
		
	}
}
