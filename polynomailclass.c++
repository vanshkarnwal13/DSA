#include<iostream>
using namespace std;
class Polynomial{
    int *degCoeff;
    int capacity;
    public:
    Polynomial(){
        degCoeff = new int[5];
        capacity = 5;
        for(int i=0;i<capacity;i++){
            degCoeff[i] = 0;
        }
    }
    Polynomial(Polynomial const &p){
        this->degCoeff = new int[p.capacity];
        this->capacity = p.capacity;
        for(int i=0;i<p.capacity;i++){
            this->degCoeff[i] = p.degCoeff[i];
        }
    }
    void setCoefficient(int degree,int coeff){
        if(degree>=capacity){
            int *newDegCoeff = new int[degree+1];
            for(int i=0;i<capacity;i++){
                newDegCoeff[i] = degCoeff[i];
            }
            for(int i=capacity;i<=degree;i++){
                newDegCoeff[i] = 0;
            }
            newDegCoeff[degree] = coeff;
            delete [] degCoeff;
            degCoeff = newDegCoeff;
            capacity = degree+1;
        }
        else{
            degCoeff[degree] = coeff;
        }
    }
    Polynomial operator+(Polynomial const &p){
        Polynomial pNew;
        int i=0,j=0,k=0;
        while(i<capacity && j<p.capacity){
            pNew.setCoefficient(k,degCoeff[i]+p.degCoeff[j]);
            i++;
            j++;
            k++;
        }
        while(i<capacity){
            pNew.setCoefficient(k,degCoeff[i]);
            i++;
            k++;
        }
        while(j<p.capacity){
            pNew.setCoefficient(k,p.degCoeff[j]);
            j++;
            k++;
        }
        return pNew;
    }
    Polynomial operator-(Polynomial const &p){
        Polynomial pNew;
        int i=0,j=0,k=0;
        while(i<capacity && j<p.capacity){
            pNew.setCoefficient(k,degCoeff[i]-p.degCoeff[j]);
            i++;
            j++;
            k++;
        }
        while(i<capacity){
            pNew.setCoefficient(k,degCoeff[i]);
            i++;
            k++;
        }
        while(j<p.capacity){
            pNew.setCoefficient(k,-p.degCoeff[j]);
            j++;
            k++;
        }
        return pNew;
    }
    Polynomial operator*(Polynomial const &p){
        Polynomial pNew;
        for(int i=0;i<capacity;i++){
            for(int j=0;j<p.capacity;j++){
                pNew.setCoefficient(i+j,degCoeff[i]*p.degCoeff[j]);
            }
        }
        return pNew;
    }
    void print(){
        for(int i=0;i<capacity;i++){
            if(degCoeff[i]!=0){
                cout<<degCoeff[i]<<"x"<<i<<" ";
            }
}
    }
};

int main(){
    int choice;
    cin >> choice;
    Polynomial first, second;
    while(choice != -1){
        switch(choice){
            case 1:
                int degree, coeff;
                cin >> degree >> coeff;
                first.setCoefficient(degree, coeff);
                break;
            case 2:
                cin >> degree >> coeff;
                second.setCoefficient(degree, coeff);
                break;
            case 3:
                first.print();
                break;
            case 4:
                second.print();
                break;
            case 5:
                Polynomial sum = first + second;
                sum.print();
                break;
            case 6:
                Polynomial diff = first - second;
                diff.print();
                break;
            case 7:
                Polynomial prod = first * second;
                prod.print();
                break;
            default:
                return 0;
        }
        cin >> choice;
    }
    return 0;
}