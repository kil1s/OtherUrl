package com.github.kil1s.other.url.model.protocol.wellknown.model;

import com.github.kil1s.other.url.model.UrlQueryState;
import com.github.kil1s.other.url.model.protocol.model.UrlProtocol;

public class UrlTLSProtocol extends UrlTCPProtocol {
    public UrlTLSProtocol() {
        this(null);
    }

    public UrlTLSProtocol(Integer port) {
        super("TLS", "Transport Layer Security", UrlQueryState.OTHER, port);
    }

    public UrlTLSProtocol(String name, String readableName, UrlQueryState state, Integer port) {
        super(name, readableName, state, port);
    }

    public UrlTLSProtocol(String name, String readableName, UrlQueryState state) {
        this(name, readableName, state, null);
    }

    @Override
    public UrlProtocol clone() {
        return new UrlTLSProtocol(name, readableName, state, port);
    }

    @Override
    public UrlProtocol clonePrivate() {
        return new UrlTLSProtocol(name, readableName, UrlQueryState.PRIVATE, port);
    }

    @Override
    public UrlProtocol clonePublic() {
        return new UrlTLSProtocol(name, readableName, UrlQueryState.PUBLIC, port);
    }
}
