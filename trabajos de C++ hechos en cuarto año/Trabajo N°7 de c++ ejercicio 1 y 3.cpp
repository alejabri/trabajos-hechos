#include<iostream>

using namespace std;

int main(){
	int numero;
	
	do{
		cout<<"digite un numero: "; cin>>numero;
	}while((numero<1) || (numero>13));
	
	for(int i=1;i<=13;i++){
		cout<<numero<<" + " <<i<<" = "<<numero+i<<endl;
	}
	
	return 0;
	
}
