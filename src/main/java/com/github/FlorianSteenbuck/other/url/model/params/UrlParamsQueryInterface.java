package com.github.FlorianSteenbuck.other.url.model.params;

import com.github.FlorianSteenbuck.other.url.model.UrlQuery;

import java.util.List;

public interface UrlParamsQueryInterface extends UrlQuery {
    boolean got(String key);
    boolean gotOption(String option);
    List<String> getOptions();
    List<String> get(String key);
    void remove(String key);
    void remove(String key, String value);
    void add(String key);
    void add(String key, String value);
}
