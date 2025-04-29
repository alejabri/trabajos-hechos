#include<iostream>

using namespace std;

int main() {
	
	int n1, n2;
	
	cout<<"ingrese el primer numero: ";
	cin>>n1;
	
	cout<<"ingrese el segundo numero: ";
	cin>>n2;
	
	if(n1 < n2){
		cout<<"es mayor el segundo";
	}
	else{
		cout<<"es mayor el primero";
	}
	
	return 0;
}
