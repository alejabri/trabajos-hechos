#include<iostream>

using namespace std;

int main(){
	int clave, dato = 1234;
	
	cout<<"digite la clave: ";
	cin>>clave;
	
    if(clave == dato){
    	cout<<"la clave es correcta";
	}
	else{
		cout<<"la clave es incorrecta";
	}

    cout<<"\nlas opciones son: "
	"\n1) Consulta de saldo Caja de Ahorro"
	"\n2) Consulta de Saldo Cta Cte"
	"\n3) Retiro Efectivo Caja de Ahorro"
	"\n4) Retiro Efectivo Cta Cte"
	"\n5) Cambio de PIN Cajero"
	"\n6) Cambio Pin Home Banking"
	"\n7) Pago Servicios"
	"\n8) Otras operaciones"
	"\n9) Finalizar"<<endl;
	
	int opciones;
	cout << "ingrese numero de la opcion: "; 
	cin >> opciones;
	switch (opciones) {
		
		case 1:cout<<"usted selecciono la opcion consulta de saldo caja de ahorro";
		break;
		case 2:cout<<"usted selecciono la opcion Consulta de Saldo Cta Cte";
		break;
		case 3:cout<<"usted selecciono la opcion Retiro Efectivo Caja de Ahorro";
		break;
		case 4:cout<<"usted selecciono la opcion Retiro Efectivo Cta Cte";
		break;
		case 5:cout<<"usted selecciono la opcion Cambio de PIN Cajero";
		break;
		case 6:cout<<"usted selecciono la opcion Cambio Pin Home Banking";
		break;
		case 7:cout<<"usted selecciono la opcion Pago Servicios";
		break;
		case 8:cout<<"usted selecciono la opcion Otras operaciones";
		break;
		case 9:cout<<"usted selecciono la opcion Finalizar";
		break;
		default:cout<<"opcion no existente";
	
	}

	return 0;
}
