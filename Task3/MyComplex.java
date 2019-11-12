package com.Task3;

public class MyComplex {

    double real=0.0;
    double imag=0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "" + (0 > this.imag ? imag : "+"+imag) + "i)";
    }

    public boolean isReal()
    {
      boolean flagReal=false;
      if (this.real!=0.0)
      {
          flagReal = true;
      }

      return flagReal;
    }

    public boolean isImaginary()
    {
        boolean flagImag=false;
        if(this.imag !=0.0)
        {
            flagImag = true;
        }

        return flagImag;
    }



    public boolean equals(double real, double imag)
    {
        return this.real==real && this.imag==imag ;
    }

    public boolean equals(MyComplex another)
    {
        return this.real==another.getReal() && this.imag==another.getImag();
    }

    public double magnitude()
    {
        return Math.sqrt(Math.pow(this.imag,2) + Math.pow(this.real,2));
    }

    public double argument()
    {
        return Math.atan(this.imag/this.real);
    }

    public MyComplex add(MyComplex right)
    {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right)
    {
        this.real+=right.real;
        this.imag+=right.imag;
        MyComplex myComplex = new MyComplex();
        myComplex.setReal(this.real);
        myComplex.setImag(this.imag);
        return myComplex;
    }

    public MyComplex substract(MyComplex right)
    {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }


    public MyComplex substractNew(MyComplex right)
    {
        this.real-=right.real;
        this.imag-=right.imag;
        MyComplex myComplex = new MyComplex();
        myComplex.setReal(this.real);
        myComplex.setImag(this.imag);
        return myComplex;

    }
    public MyComplex multiply(MyComplex right)
    {
         double tmp = (this.real*right.real)-(this.imag*right.imag);
        this.imag = (this.real*right.imag)+(this.imag*right.real);
        this.real = tmp;
        return this;

    }

    public MyComplex divide(MyComplex right)
    {
        double tmp = (this.real*right.real + this.imag*right.imag)/
                (Math.pow(right.real,2)+ Math.pow(right.imag,2));
        this.imag = (right.real*this.imag - this.real*right.imag)/(Math.pow(right.imag,2)+Math.pow(right.real,2));
        this.real=tmp;
        return this;
    }

    public MyComplex conjugate()
    {
        MyComplex myComplex = new MyComplex();
        myComplex = this;
        return myComplex;


    }
	@Override
    public int hashCode() {
        int result = 17;

        result = 19 * result + (int)((Double.doubleToLongBits(real))^(Double.doubleToLongBits(real)>>>32));
        result = 19 * result + (int)((Double.doubleToLongBits(imag))^(Double.doubleToLongBits(imag)>>>32));

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MyComplex myComplex = (MyComplex) obj;
        return myComplex.real == real && myComplex.imag == imag;
    }

}
