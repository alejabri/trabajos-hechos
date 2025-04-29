#include<iostream>

using namespace std;

int main() {
	
	int nota, dato = 6;
	
	cout<<"ingrese la nota: ";
	cin>>nota;
	
	if(nota > dato) {
		
		cout<<"aprovado";
	}
	else {
		cout<<"desaprovado";
	}
	
	return 0;
}
