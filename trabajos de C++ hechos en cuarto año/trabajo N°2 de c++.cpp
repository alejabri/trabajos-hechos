#include<iostream>

using namespace std;

int main()
{
    int dia;
    cout << "ingrese dia de la semana: ";
    cin >> dia;
    switch (dia) {
        case 1:
        	cout<<"el dia es domingo";
        	break;
        case 2:
        	cout<<"el dia es lunes";
        	break;
        case 3:
        	cout<<"el dia es martes";
        	break;	
    	case 4:
        	cout<<"el dia es miercoles";
        	break;
    	case 5:
        	cout<<"el dia es jueves";
        	break;
    	case 6:
        	cout<<"el dia es viernes";
        	break;
    	case 7:
        	cout<<"el dia es sabado";
        	break;
		default:
		    cout<<"dia no disponible";		
    } 
    return 0;
}
