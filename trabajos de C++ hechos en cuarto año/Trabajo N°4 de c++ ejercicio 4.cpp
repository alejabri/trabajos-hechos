#include<iostream>
#include<stdlib.h>

using namespace std;

int main(){
	
	char nombre[50];
	
	cout<<"\ndigite su nombre y apellido: "; cin>>nombre;
		 
    cout << "menu de opcciones: "
    "\n1) Responsable Inscripto"
    "\n2) Regimen Simplificado (RS) - Monotributista Cat. A"
	"\n3) Regimen Simplificado (RS) - Monotributista Cat. B"
	"\n4) Regimen Simplificado (RS) - Monotributista Cat. C"
	"\n5) Regimen Simplificado (RS) - Monotributista Cat. D"
	"\n6) Responsable Inscripto (RI)"
	"\n7) Exento"
	"\n8) Consumidor Final"
	"\n9) Otros no especificado"<<endl;
	
	int iva;
    
	cout<< "\nelija una opccion: "<<endl;
	cin>>iva;
	switch(iva){
		
		case 1:
			cout<<"IVA del 21%";
			break;
		case 2:
			cout<<"IVA del 21%";
			break;
		case 3:
			cout<<"IVA del 21%";
			break;
		case 4:
			cout<<"IVA del 21%";
			break;
		case 5:
			cout<<"IVA del 21%";
			break;
		case 6:
			cout<<"IVA del 21%";
			break;					
		case 7:
			cout<<"IVA del 21%";
			break;
		case 8:
			cout<<"IVA del 21%";
			break;
		case 9:
			cout<<"IVA del 21%";
			break;
		default:
			cout<<"opccion no disponible";
			
    }
		char direccion[100];
		char hora[10];	
			
		cout<< "\ndigite si direccion: "; cin>>direccion;
		cout<< "\ndigite horario:"; cin>>hora;
	
	return 0;
}
