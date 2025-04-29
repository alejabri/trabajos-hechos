#include<iostream>
#include<string.h>

using namespace std;

main(){
	
	char adivinanza[50];
	
	cout<<"que no se mueve y tiene 4 patas: ";
	gets(adivinanza);
	
	if(strcmpi(adivinanza,"mesa")==0) {
		
		cout<<"felicidades respuesta correcta";
	}
	
	else {
		
		cout<<"respuesta incorrecta la respuesta es mesa";
	}
	
	return 0;
}
