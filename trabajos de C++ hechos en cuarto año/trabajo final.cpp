#include<iostream>

using namespace std;

int main(){
	int puerta;
	cout<<"si la puerta esta cerrada ponga 1 si la puerta no esta cerrada ponga 2: ";
	cin>>puerta;
	switch(puerta){
		case 1:
			cout<<"la puerta esta cerrada\n";
			break;
		case 2:
			cout<<"la puerta no esta cerrada\n";
			break;
		default:
			cout<<"opccion no disponible\n";
		
	}
	
	
	int nivel, datos = 1;
	
	cout<<"ponga 1 si quiere cargar agua ponga 2 si no quiere cargar agua:  ";
	cin>>nivel;
	
	if(nivel == datos){
		cout<<"cargando el agua: ";
		
	}
	else{
		cout<<"no cargar agua: ";
	
	}
	
	int i;
	
	i=1;
	
	while(i<=10){
		cout<<i<<endl;
		i++;
	}
	
	int agua;
	cout<<"si esta lleno de agua ponga 1 si no esta lleno de agua ponga 2: ";
	cin>>agua;
	switch(agua){
		case 1:
			cout<<"esta lleno de agua\n";
			break;
		case 2:
			cout<<"no esta lleno de agua\n";
			break;
		default:
			cout<<"opccion no disponible\n";
		
	}
	
	int lavado, datas = 1;
	
	cout<<"si quiere lavado rapido ponga 1 si quiere lavado profundo ponga 2: ";
	cin>>lavado;
	
	if(lavado == datas){
		cout<<"\nlavado rapido empieza: "
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n finaliza el lavado";
		
	}
	else{
		cout<<"lavado profundo empieza: "
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la izquierda"
		"\n se detiene 5 segundos"
		"\n gira 15 segundos a la derecha"
		"\n se detiene 5 segundos"
		"\n finaliza el lavado";
	}

	
	
	
	
	return 0;
}
