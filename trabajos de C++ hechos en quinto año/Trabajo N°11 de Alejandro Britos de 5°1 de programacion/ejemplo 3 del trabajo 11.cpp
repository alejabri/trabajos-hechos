/* Dada una lista de alumnos conteniendo nombres y notas, mostrar los
nombres de los alumnos cuya nota sea 10. El listado finaliza cuando la nota es
menor o igual a 0(cero). (control con dato centinela o bandera). */

/* Control con la nota del alumno, en este ejemplo usaremos while con la
condici�n de que se repita mientras la nota sea mayor a 0 (tambi�n puedo usar
distinto), el while controla la condici�n al principio o sea si el primero tiene
como nota un 0 el ciclo no se va a ejecutar ninguna vez. */

#include<iostream>

using namespace std;

main() {
	
	int nota;
	char nom[30];
	
	cout<<"ingrese nota del alumno: "<<endl;
	cin>>nota;
	
	while(nota>0) {
		
		cout<<"ingrese nombre del alumno: "<<endl;
		cin>>nom;
		
		if(nota==10) {
			
			cout<<nom<<endl;
		} 
		
		cout<<"ingrese nota del alumno: "<<endl;
		cin>>nota;
	}  
	
	return 0;
}
