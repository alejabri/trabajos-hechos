#include<iostream>

using namespace std;

int main() {
	
	int tp, e, el, l, suma;
	
	cout<<"introdusca la nota del trabajo practico: ";
	cin>>tp;
	
	cout<<"introdusca la nota del examen: ";
	cin>>e;
	
	cout<<"introdusca la nota de la primera leccion: ";
	cin>>el;
	
	cout<<"introdusca la nota de la segunda leccion: ";
	cin>>l;
	
	suma=(tp+e+el+l)/4;
	
	cout<<"su promedio es:"<<suma;
	
	return 0;
}
