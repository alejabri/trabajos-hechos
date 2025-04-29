#include<iostream>

using namespace std;

int main(){
	int numero;
	
	do{
		cout<<"digite un numero: "; cin>>numero;
	}while((numero<1) || (numero>20));
	
	for(int i=1;i<=20;i++){
		if(i+2 == 0){
			numero=numero+i;
		}
		cout<<numero<<" + " <<i<<" = "<<numero+i<<endl;
	}
	
	return 0;
	
}
