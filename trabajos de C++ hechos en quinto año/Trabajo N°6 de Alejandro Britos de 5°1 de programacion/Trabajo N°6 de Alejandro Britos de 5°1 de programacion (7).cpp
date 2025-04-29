#include<iostream>

using namespace std;

int main() {
	
	int nota1, nota2, nota3, promedio;
	
	cout<<"ingrese la primera nota: ";
	cin>>nota1;
	
	cout<<"ingrese la segunda nota: ";
	cin>>nota2;
	
	cout<<"ingrese la tercera nota: ";
	cin>>nota3;
	
	promedio=(nota1+nota2+nota3)/3;
	
	cout<<"la nota final es: "<<promedio;
	
	return 0;
}
