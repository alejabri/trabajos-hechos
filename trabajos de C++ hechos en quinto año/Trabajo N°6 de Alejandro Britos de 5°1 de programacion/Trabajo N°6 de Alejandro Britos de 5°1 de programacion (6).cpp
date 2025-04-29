#include<iostream>

using namespace std;

int main() {
	
	float lunes, miercoles, viernes, promedio;
	
	cout<<"ingrese el tiempo que a corrido el lunes: ";
	cin>>lunes;
	
	cout<<"ingrese el tiempo que a corrido el miercoles: ";
	cin>>miercoles;
	
	cout<<"ingrese el tiempo que a corrido el viernes: ";
	cin>>viernes;
	
	promedio=(lunes+miercoles+viernes)/60;
	
	cout<<"el tiempo que a corrido es: "<<promedio;
	
	return 0;
}
