package org.example;

public class Movie {
    private int mid;
    private String mname;
    private int mrating;
    private String mdate;

    public Movie(int mid,String mname,int mrating,String mdate)
    {
        this.mid=mid;
        this.mname=mname;
        this.mrating=mrating;
        this.mdate=mdate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mrating=" + mrating +
                ", mdate='" + mdate + '\'' +
                '}';
    }
}
