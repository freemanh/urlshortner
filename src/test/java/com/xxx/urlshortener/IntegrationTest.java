package com.xxx.urlshortener;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by hanxi on 2017/5/4.
 */
public class IntegrationTest {

    private ShortURLService service;

    @Before
    public void setup() {
        service = new ShortURLService();

        ShortURLRepo repo = new ShortURLRepo();
        service.setRepo(repo);

        IdGenerator ge = new IdGenerator();
        service.setGe(ge);
    }

    @org.junit.Test
    public void testSameURL() {
        assertEquals("http://t.xxx/a", service.get("http://www.sohu.com"));
        assertEquals("http://t.xxx/a", service.get("http://www.sohu.com"));
    }

    @org.junit.Test
    public void testDiffURL(){
        assertEquals("http://t.xxx/a", service.get("http://www.sohu.com"));
        assertEquals("http://t.xxx/b", service.get("http://www.163.com"));
    }
}
