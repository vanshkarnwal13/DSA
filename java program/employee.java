

public class employee {
    int empno;
    String name;
    Address address;

    public employee(int empno, String name, Address address) {
        this.empno = empno;
        this.name = name;
        this.address = address;
    }
    
    void display(){
        System.out.println(empno+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }


    public static void main(String[] args) {
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","UP","india");

        employee e=new employee(111,"ankit",address1);
        employee e2=new employee(112,"sumit",address2);

        e.display();
        e2.display();
    }

    
}
