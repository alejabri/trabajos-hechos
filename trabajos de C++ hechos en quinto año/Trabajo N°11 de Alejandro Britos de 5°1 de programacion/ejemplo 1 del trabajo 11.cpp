/*Dada una lista de 20 alumnos conteniendo nombres y notas, mostrar los
nombres de los alumnos cuya nota sea 10. (control con contador). */

/*El ciclo tiene 20 repeticiones, como sabemos la cantidad de repeticiones
usamos el ciclo FOR (también se puede resolver el ejercicio usando WHILE o
DO WHILE). */

#include<iostream>

using namespace std;

main() {
	
	int nota, i;
	char nom[30];
	
	for(i=0; i<20; i++) {
		
		cout<<"ingrese nombre del alumno: "<<endl;
		cin>>nom;
		cout<<"ingrese nota del alumno: "<<endl;
		cin>>nota;
		
		if(nota==10) {
			
			cout<<nom<<endl;
		}
	}
	
	return 0;
}
