#include<iostream>

using namespace std;

int main(){
	
    cout<<"menu de herramientas: "
    "\n1) lijaroda orbital"
    "\n2) lijadora de banda"
    "\n3) taladro con percutor"	
    "\n4) taladro con variador de velocidad"
    "\n5) sierra circular"
    "\n6) sierra caladora"
    "\n7) cepillo"
    "\n8) podadora"
    "\n9) motosierra"<<endl;

    int herramientas;
    cout << "ingrese numero de la herramienta: ";
    cin >> herramientas;
    switch (herramientas){
    	
    	case 1:
    		cout<<"lijadora orbital: "
    		"\nmarca 1: $12.000 - marca 2: $14.000 - marca 3: $15.000";
    		break;
    	case 2:
    		cout<<"lijadora de banda: "
    		"\nmarca 1: $14.000 - marca 2: $14.700 - marca 3: $16.200";
    		break;
		case 3:
    		cout<<"taladro con percutor: "
    		"\nmarca 1: $4.000 (OFERTA) - marca 2: $6.700 - marca 3: $8.700";
    		break;
		case 4:
    		cout<<"taladro con variador de velocidad: "
    		"\nmarca 1: $7.000 - marca 2: $8.700 - marca 3: $9.800";
    		break;
		case 5:
    		cout<<"sierra circular: "
    		"\nmarca 1: $12.500 - marca 2: $19.600 - marca 3: $23.000";
    		break;
		case 6:
    		cout<<"sierra caladora: "
    		"\nmarca 1: $6.300 - marca 2: $9.000 - marca 3: $12.000";
    		break;
		case 7:
    		cout<<"cepillo: "
    		"\nmarca 1: $5.000 - marca 2: $7.000 - marca 3: $8.500";
    		break;
		case 8:
    		cout<<"podadora: "
    		"\nmarca 1: $6.500 - marca 2: $7.100 - marca 3: $8.900";
    		break;
		case 9:
    		cout<<"motosierra: "
    		"\nmarca 1: $10.000 - marca 2: $11.500 - marca 3: $18.000";
    		break;
		default:
			cout<<"herramienta no disponible";
		
	}
    
	return 0;
}
