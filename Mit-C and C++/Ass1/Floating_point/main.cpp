#include <iostream>
#include <stdlib.h>
using namespace std;
class FloatingOperation{
	private :
			int wholeBinary[32];
			int whole;
			float menti;
	 		float number;
	 		char *who,*men;
	 		float float_data_temp[32];
	 		int float_data_temp_size=0;
	public  :

	 FloatingOperation(string num){
	 	Initalization(num);
		generateBinary(whole); 	
	}
	void Initalization(string num){
		char w[num.size()];
		char m[num.size()];
		int i=0,j=0,k=0;
			for(i=0;i<num.size();i++){

				if(num[i]=='.'){
					w[j]='\0';
					break;
				}else{
					w[j]=num[i];
					j++;
				}
			}
			m[k++]='0';
			m[k++]='.';
			for(j=i+1;j<num.size();j++){
				m[k++]=num[j];
			}	

		who=w;
		men=m;
		whole=findDecimal(who);
		menti=findFractional(men);
	}	

	int findDecimal(char* num){
		return  atoi(num);
	}
	
	float findFractional(char *num){
		return atof(num);
	}

	float float_generateBinary(float number){
			float num=number;
			if(check_avablity_floatData(num)){
				float_data_temp[float_data_temp_size++]=num
				num=num*2;

			}

	


	}bool check_avablity_floatData(float num){

		if(float_data_temp_size==0){
			return true;
		}else{

				for(int i=0;i<float_data_temp_size;i++){
					if(num==float_data_temp[float_data_temp_size]){
						return true;
					}
				}
			return false;
		}
	}
	int int_generateBinary(int whole_number){
		 int k,len=0;
		 int dec_bin[32];
		 
		 while(whole_number!=0){
		 		dec_bin[k]=whole_number%2;
		 		whole_number=whole_number/2;
		 		k++;
		 		len++;
		 }
		 cout<<menti;
		 /*for(int i=k-1;i>=0;i--)
		 	cout<<dec_bin[i];
		 	
		 cout<<endl;
		 */
		 return 0;

	}
	void run(){



	}

};




int main(int argc, char *argv[]){
	
	string num;
	cin>>num;
	FloatingOperation f(num);


	return 0;
}