#include<iostream>
#include<conio.h>

using namespace std;

int main () {
	int t1, t2, t3, menor, medio, mayor;
	
	cout<<"ingrese el codigo del primer torno: ";
	cin>>t1;
	
	cout<<"ingrese el peso del primer torno: ";
	cin>>t1;
	
	cout<<"ingrese el codigo del segundo torno: ";
	cin>>t2;
	
	cout<<"ingrese el peso del segundo torno: ";
	cin>>t2;
	
	cout<<"ingrese el codigo del tercer torno: ";
	cin>>t3;
	
	cout<<"ingrese el peso del tercer torno: ";
	cin>>t3;
	
	if((t1 <= t2) && (t1 <= t3)) {
		
		menor = t1;
		
		    if(t2 <= t3){
			    medio = t2;
			    mayor = t3;
	        }else{
		        medio = t3;
		        mayor = t2;
	        }
		
	}else if((t2 <= t1) && (t2 < t3)) {
		
		            menor = t2;
		
		            if(t1 <= t3) {
			            medio = t1;
			            mayor = t3;
		                }else{
			                medio = t3;
			                mayor = t1;
		                }
	}else{
		menor = t3;
		
		if(t1 <= t2) {
			medio = t1;
			mayor = t2;
		}else{
			medio = t2;
			mayor = t1;
		}
	}
	cout << menor << "\t" << medio << "\t" << mayor;
	
	return 0;
}
