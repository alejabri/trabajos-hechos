#include<iostream>

using namespace std;

int main() {
	
	int n1, n2, menor, mayor, suma, resta;
	
	cout<<"ingrese el primer numero: ";
	cin>>n1;
	
	cout<<"ingrese el segundo numero: ";
	cin>>n2;
	
	if(n1 < n2) {
		mayor = n1;
		menor = n2;
		
		suma = n2 + n1;
		
		cout<<"la suma es: "<<suma;
		
	}
	else {
		mayor = n2;
		menor = n1;
		
		resta = n1 - n2;
		
		cout<<"la resta es: "<<resta;
	}
	
	return 0;
}
