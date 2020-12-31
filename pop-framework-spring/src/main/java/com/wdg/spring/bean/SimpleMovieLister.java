package com.wdg.spring.bean;

/**
 * @description: setter×¢ÈëÊ¾Àý
 * @author: WuDG/1490727316@qq.com
 * @date: 2020/12/31 13:37
 */
public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on the MovieFinder
    private MovieFinder movieFinder;

    // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    // business logic that actually uses the injected MovieFinder is omitted...
}