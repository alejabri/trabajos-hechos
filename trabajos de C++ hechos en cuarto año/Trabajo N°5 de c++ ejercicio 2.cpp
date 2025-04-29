#include<iostream>

using namespace std;

int main(){
	
	cout<<"las opciones son: "
	"\n1) Linux Debian"
	"\n2) Linux Ubuntu Mate"
	"\n3) Linux Ubuntu 19.10"
	"\n4) Linux Ubuntu Core"
	"\n5) Linux Ubuntu Server"
	"\n6) Windows 10 Core"
	"\n7) Linux Balena"
	"\n8) Arch Linux"
	"\n9) OSMC o LibreELEC"
	"\n10) FlintOS"
	"\n11) RetroPie"
	"\n12) OS RISC"<<endl;

	int opciones;
	cout << "ingrese numero de la opcion: "; 
	cin >> opciones;
	switch (opciones) {
		
	case 1:cout<<"iniciando Linux Debian";
	break;	
	case 2:cout<<"iniciando Linux Ubuntu Mate";
	break;
	case 3:cout<<"iniciando Linux Ubuntu 19.10";
	break;
	case 4:cout<<"iniciando Linux Ubuntu Core";
	break;
	case 5:cout<<"iniciando Linux Ubuntu Server";
	break;
	case 6:cout<<"iniciando Windows 10 Core";
	break;
	case 7:cout<<"iniciando Linux Balena";
	break;
	case 8:cout<<"iniciando Arch Linux";
	break;
	case 9:cout<<"iniciando OSMC o LibreELEC";
	break;
	case 10:cout<<"iniciando FlintOS";
	break;
	case 11:cout<<"iniciando RetroPie";
	break;
	case 12:cout<<"iniciando OS RISC";
	break;
	default:cout<<"no es posible iniciar";
		
	}
	
	return 0;
}
