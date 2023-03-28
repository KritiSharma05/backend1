package org.example;

public class Product {
    private int pid;
    private String pname;
    private String pcolor;
    public Product(int pid,String pname,String pcolor)
    {
        this.pid=pid;
        this.pname=pname;
        this.pcolor=pcolor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcolor='" + pcolor + '\'' +
                '}';
    }
}
