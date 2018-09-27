package com.ysk.service;

/**
 * @author Bob Simon
 */
public interface RedisService {

    void set(String key, Object value);

    Object get(String key);

}
