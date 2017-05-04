package com.xxx.urlshortener;

import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

/**
 * Created by hanxi on 2017/5/4.
 */
public class ShortURLUtilTest {
    @org.junit.Test
    public void test(){
        assertEquals("a", ShortURLUtil.idToShortURL(0));
        assertEquals("9", ShortURLUtil.idToShortURL(61));
        assertEquals("ba", ShortURLUtil.idToShortURL(62));
        assertEquals("bb", ShortURLUtil.idToShortURL(63));
    }
}
