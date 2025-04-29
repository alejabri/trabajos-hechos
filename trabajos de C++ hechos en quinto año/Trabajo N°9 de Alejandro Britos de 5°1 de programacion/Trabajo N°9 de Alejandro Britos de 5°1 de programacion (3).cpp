#include<iostream>
#include<conio.h>

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
	
	switch(promedio) {
		case 1: cout<<"1 aplazado"; break;
		case 2: cout<<"2 aplazado"; break;
		case 3: cout<<"3 aplazado"; break;
		case 4: cout<<"4 desaprobado"; break;
		case 5: cout<<"5 desaprobado"; break;
		case 6: cout<<"6 desaprobado"; break;
		case 7: cout<<"7 aprobado"; break;
		case 8: cout<<"8 aprobado"; break;
		case 9: cout<<"9 aprobado"; break;
		case 10: cout<<"10 aprobado"; break;
		default: cout<<"error";
	}
	
	getch();
	return 0;
}
