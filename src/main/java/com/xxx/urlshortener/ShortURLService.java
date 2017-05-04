package com.xxx.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hanxi on 2017/5/4.
 */
public class ShortURLService {
    private static String SHORT_URL_TEMP = "http://t.xxx/%1$s";

    private ShortURLRepo repo;
    private IdGenerator ge;

    public String get(String s) {
        Long id = repo.findIdByURL(s);
        if (null == id) {
            id = ge.next();
        }

        repo.save(id, s);
        return String.format(SHORT_URL_TEMP, ShortURLUtil.idToShortURL(id));
    }

    public void setRepo(ShortURLRepo repo) {
        this.repo = repo;
    }

    public void setGe(IdGenerator ge) {
        this.ge = ge;
    }
}

