interface IOperator{
    void addition(Object o1,Object o2);
    void subtraction(Object o1,Object o2);
    void printResult(Object o);
}

class Complex{
    private int real;
    private int imaginary;
    public int getReal(){
        return real;
    }

    public void setReal(int real){
        this.real=real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void setImaginary(int imaginary){
        this.imaginary=imaginary;
    }
}


class OperatorComplexImpl implements IOperator{
    public void addition(Object o1,Object o2){
        Complex c=new Complex();
        Complex c1=(Complex)o1;
        Complex c2=(Complex)o2;
        c.setReal(c1.getReal()+c2.getReal());
        c.setImaginary(c1.getImaginary()+c2.getImaginary());
        printResult(c);

    }







    public void subtraction(Object o1, Object o2) {
        Complex c=new Complex();
        Complex c1=(Complex)o1;
        Complex c2=(Complex)o2;
        c.setReal(c1.getReal()-c2.getReal());
        c.setImaginary(c1.getImaginary()-c2.getImaginary());
        printResult(c);
    }

    public void printResult(Object o) {
        Complex c=(Complex)o;
        System.out.println(c.getReal()+"+"+c.getImaginary()+"i");
    }
}

public class ObjectDemo {
    public static void main(String[] args){
        Complex c3=new Complex();
        c3.setReal(2);
        c3.setImaginary(4);
        Complex c4=new Complex();
        c4.setReal(3);
        c4.setImaginary(3);
        IOperator o=new OperatorComplexImpl();
        o.addition(c3, c4);
        o.subtraction(c3, c4);
    }
}