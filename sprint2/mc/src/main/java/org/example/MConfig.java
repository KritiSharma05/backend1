package org.example;

import org.springframework.context.annotation.Bean;

public class MConfig {
    @Bean("movie1")
    public Movie getmovie1()
    {
        return new Movie(1001,"Tiger Zinda Hai",8,"20/10/2020");
    }
    @Bean("movie2")
    public Movie getmovie2()
    {
        return new Movie(1002,"Kuch Kuch Hota Hai",6,"03/08/1998");
    }
    @Bean("movie3")
    public Movie getmovie3()
    {
        return new Movie(1003,"Avatar2",9,"16/12/2022");
    }

}
