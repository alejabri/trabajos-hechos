#include<iostream>

using namespace std;

int main() {
	
	float hombres, mujeres, personas, hombre, mujer;
	
	cout<<"introducir el numero de hombres: ";
	cin>>hombres;
	
	cout<<"introducir el numero de mujeres: ";
	cin>>mujeres;
	
	personas=hombres+mujeres;
	hombre=(hombres*100)/personas;
	mujer=(mujeres*100)/personas;
	
	cout<<"porcentaje de hombres: "<<hombre; cout<<"%";
	cout<<"\nporcentaje de mujeres: "<<mujer; cout<<"%";
	
	return 0;
}
