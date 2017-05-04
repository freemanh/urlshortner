package com.xxx.urlshortener;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hanxi on 2017/5/4.
 */
public class ShortURLRepo {
    private Map<String, Long> urlIdMap = new HashMap();

    public Long findIdByURL(String url) {
        return urlIdMap.get(url);
    }

    public void save(Long id, String url) {
        urlIdMap.put(url, id);
    }
}
