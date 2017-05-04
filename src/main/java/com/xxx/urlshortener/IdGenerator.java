package com.xxx.urlshortener;

/**
 * Created by hanxi on 2017/5/4.
 *
 * Consider performance issue, should replace by Redis implementation in product environment.
 */

public class IdGenerator {
    private long id = 0;

    public Long next() {
        return id++;
    }
}
