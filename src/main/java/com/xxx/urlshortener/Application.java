package com.xxx.urlshortener;

import org.springframework.boot.SpringApplication;

/**
 * Created by hanxi on 2017/5/4.
 */
public class Application {
    public static void main(String[] args) {
        // setup
        ShortURLService service = new ShortURLService();

        ShortURLRepo repo = new ShortURLRepo();
        service.setRepo(repo);

        IdGenerator ge = new IdGenerator();
        service.setGe(ge);

        // do real work
        for (String arg : args) {
            System.out.println(service.get(arg));
        }

    }
}
