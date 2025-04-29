#include<iostream>
#include<string.h>

using namespace std;

main() {
	
	char edad[3], nom[40], localidad[40], persona, n[2];
	
	cout<<"c para continuar otra tecla para finalizar: ";
	cin>>persona;
	
	while (persona=='c' || persona=='C') {
		
		cout<<"\ningrese edad: ";
		cin>>edad;
		cout<<" "; //esto lo hice porque me saltea la parte del nombre
		gets(n);
		cout<<"ingrese nombre: ";
		gets(nom);
		cout<<"ingrese localidad: ";
		gets(localidad);
		
		if(strcmpi(localidad,"wilde")==0) {
			
		
			cout<<"nombre: "<<nom<<endl;
			cout<<"edad: "<<edad<<endl;
			
		}
		
		cout<<"c para continuar otra tecla para finalizar: ";
		cin>>persona;
		
	}
	
	return 0;
}
