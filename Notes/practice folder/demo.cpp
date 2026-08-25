

#include <iostream>
using namespace std;


int sum(){
	int a,b;
	cout<<"enter the numbers";          // sum of numbers
		cin>>a>>b;
		cout<<"sum is"<<a+b<<endl;
		return 0;

};

void square(){
		cout<<"enter side";
		int a;
		cin>>a;                  //  square

		cout<<"area is"<<a*a<<endl;

};
//

void swapping(){
   	int a=1;
   	int b=2;
   	int t=0;                            //swapping
   	cout<<"1st is"<<a<<endl;
   		cout<<"2nd is"<<b<<endl;
   	t=a;
   	a=b;
   	b=t;
   	cout<<"1st is"<<a<<endl;
   	cout<<"2nd is"<<b<<endl;

};



void power(){
		cout<<"enter number and its power";
		int a,b;
		cin>>a>>b;                       //   power
		int power=1;
		for(int i=1;i<=b;i++){
			power*=a;
		}
		cout<<power<<endl;
};




void si(){

	cout<<"enter amount,rate of intrest,time in years respectievely...";
	int p,r,t;                                                                //   simple intrest......
	cin>>p>>r>>t;
	cout<<"simple intrest is"<<(p*r*t)/100<<endl;
};



// formula of ci=a-p   a=p(1+r/100)*t

void ci(){
	cout<<"enter p,r,t";
		int p,r,t;
		cin>>p>>r>>t;
		int amount=p;
		for(int i=1;i<=t;i++){
			amount=amount*(100+r)/100;
		}
		int ci=amount-p;
		cout<<"compound intrest"<<ci<<endl;

};
int main(){


sum();
square();
swapping();
power();
si();
ci();




	return 0;
}



