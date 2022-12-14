package com.github.kil1s.other.url.model.list.domain;

import com.github.kil1s.other.url.model.list.UrlPseudoQueryList;
import com.github.kil1s.other.url.model.list.UrlQueryList;

public class UrlDomainPublic<T> extends UrlPseudoQueryList<T> {
    public UrlDomainPublic(UrlQueryList<T> queryList) {
        super(queryList);
    }
}
