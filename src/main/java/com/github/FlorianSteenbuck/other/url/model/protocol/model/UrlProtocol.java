package com.github.FlorianSteenbuck.other.url.model.protocol.model;

import com.github.FlorianSteenbuck.other.url.model.UrlQuery;
import com.github.FlorianSteenbuck.other.url.model.UrlQueryState;

public interface UrlProtocol extends UrlQuery {
    void setPort(Integer port);
    boolean gotPort();
    Integer getPort();
    String getName();
    String getReadableName();
    UrlProtocol clone();
    UrlProtocol clonePrivate();
    UrlProtocol clonePublic();
    UrlQueryState getState();
}
