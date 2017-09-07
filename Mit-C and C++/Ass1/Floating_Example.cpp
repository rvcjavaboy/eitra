#include <iostream>
#include "data.h"
#include <math.h>
using namespace std;

class Floating_point{
	int dec_bin[8],dec_bin_size=0;
	int man=0,shift_bit;
	char sign;
	int float_binary[24],float_binary_size=0,temp_data_size=0;	

public:
	bool number_seprater(float num){
		if(checkSign(num)){
			num=fabsf(num);

		}
		
		obj.bits=(int)num;
		float ff=(num-((int)num));
		float rounded_down = ((int)(ff * 100 + .5) / 100.0);
		obj.f=rounded_down;
		}
	bool checkSign(float num){
		if(num<0){
			sign='-';
			return true;
		}	
	}	
	void run(){
		DecimalGenerateBinary();
		FloatGenrateBinary();
		shift_bit=shifBit();
		 print_Float();
		/*
		cout<<"DecimalGenerateBinary";
		for(int k=dec_bin_size-1;k>=0;k--)
			cout<<dec_bin[k];	

		cout<<endl<<"FloatGenrateBinary";
		for(int k=0;k<float_binary_size-1;k++)
			cout<<float_binary[k];
		cout<<endl;		

		cout<<endl<<"temp GenrateBinary";
		for(int k=0;k<temp_data_size-1;k++)
			cout<<temp_data[k]<<endl;
		cout<<endl;			*/

	}
	
	void print_Float(){
		cout<<sign;
		for(int k=dec_bin_size-1;k>=0;k--)
			cout<<dec_bin[k];	
			
		cout<<".";
		
		for(int k=0;k<float_binary_size-1;k++)
			cout<<float_binary[k];
			
		cout<<"* 2^"<<shift_bit<<endl;


	}
	void DecimalGenerateBinary(){
		int dec=obj.bits;
		while(dec!=0){
				dec_bin[dec_bin_size++]=dec%2;
				dec=dec/2;
		}


	}
	void FloatGenrateBinary(){
			if(checkFloatNumber(obj.f)){
				float t=obj.f*2;
				number_seprater(t);
				float_binary[float_binary_size++]=obj.bits;
				FloatGenrateBinary();
			}

	}

	bool checkFloatNumber(float num){
		if(man>23)
			return false;
		else{
			man++;
			return true;
			}
	}

	int shifBit(){
		int index=0;
		for(int i=0;i<dec_bin_size-1;i++){

			if(dec_bin[i]==1){
				index=i;
				break;
			}	
		}

		int n=(dec_bin_size-1)-index;
		cout<<"Shift Position"<<n<<endl;
		return n;	



	}

};

int main(){
	float number;
	cout<<"Enter The Floating point Number"<<endl;
	cin>>number;
	Floating_point f;
	f.number_seprater(number);
	f.run();
}