#include<iostream>

using namespace std;

int main() {
	
	float salario, porcentaje, final;
	
	cout<<"ingrese su salario: ";
	cin>>porcentaje;
	
	salario = porcentaje*25/100;
	final = salario+porcentaje;
	
	cout<<"su salario a incrementado: "<<salario;
	
	cout<<"\nen total: "<<final;
	
	return 0;
}
