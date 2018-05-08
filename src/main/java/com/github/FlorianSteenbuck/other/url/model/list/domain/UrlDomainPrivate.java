package com.github.FlorianSteenbuck.other.url.model.list.domain;

import com.github.FlorianSteenbuck.other.url.model.list.UrlPseudoQueryList;
import com.github.FlorianSteenbuck.other.url.model.list.UrlQueryList;

public class UrlDomainPrivate<T> extends UrlPseudoQueryList<T> {
    public UrlDomainPrivate(UrlQueryList<T> queryList) {
        super(queryList);
    }
}
