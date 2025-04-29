/* Dada una lista de alumnos conteniendo nombres y notas, mostrar los
nombres de los alumnos cuya nota sea 10. El listado finaliza cuando el
operador lo indique. (control con confirmación del operador). */

/* Confirmación del usuario para continuar, usamos DO-WHILE para
asegurarnos que el ciclo se ejecute la primera vez y luego se volverá a ejecutar
si el usuario lo requiere. */

#include<iostream>

using namespace std;

main() {
	
	int nota, resp;
	char nom[30];
	
	do {
		
		cout<<"ingrese nombre del alumno: "<<endl;
		cin>>nom;
		cout<<"ingrese nota del elumno: "<<endl;
		cin>>nota;
		
		if(nota==10) {
			
			cout<<nom<<endl;
		}
		
		cout<<"desea seguir ingresando notas 1=si/0=no: "<<endl;
		cin>>resp;
		
	}while(resp==1);
	
	return 0;
}
