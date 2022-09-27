class bank{
    int getinterest(){
        return 0;
    }
}

class sbi extends bank{
    int getinterest(){
        return 8;
    }
}

class icici extends bank{
    int getinterest(){
        return 7;
    }
}

class axis extends bank{
    int getinterest(){
        return 9;
    }
}

class bankmain{
    public static void main(String args[]){
        sbi s = new sbi();
        icici i = new icici();
        axis a = new axis();
        System.out.println("SBI interest rate is "+s.getinterest());
        System.out.println("ICICI interest rate is "+i.getinterest());
        System.out.println("AXIS interest rate is "+a.getinterest());
    }
}


