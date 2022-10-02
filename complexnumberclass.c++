#include<iostream>
using namespace std;
class complex{
    int real;
    int img;
    public:
    complex(int r=0,int i=0){
        real=r;
        img=i;
    }
    complex plus(complex c){
        complex temp;
        real=real+c.real;
        img=img+c.img;
        
    }
    complex multiply(complex c){
        real=real*c.real;
        img=img*c.img;
    }
    void print(){
        cout<<real<<"+"<<img<<"i"<<endl;
    }
};





int main(){
    int real1, imaginary1, real2, imaginary2;
    cout<<"Enter the real part of first complex number: ";
    cin>>real1;
    cout<<"Enter the imaginary part of first complex number: ";
    cin>>imaginary1;
    cout<<"Enter the real part of second complex number: ";
    cin>>real2;
    cout<<"Enter the imaginary part of second complex number: ";
    cin>>imaginary2;
    complex c1(real1, imaginary1);
    complex c2(real2, imaginary2);
    int choice;
    cin>>choice;
    if(choice==1){
        c1.plus(c2);
        c1.print();
    }
    else if(choice==2){
        c1.multiply(c2);
        c1.print();
    }
    else{
        return 0;
    }
}