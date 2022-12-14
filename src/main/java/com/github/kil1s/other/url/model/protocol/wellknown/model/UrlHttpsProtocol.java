package com.github.kil1s.other.url.model.protocol.wellknown.model;

import com.github.kil1s.other.url.model.UrlQueryState;
import com.github.kil1s.other.url.model.protocol.model.UrlProtocol;

public class UrlHttpsProtocol extends UrlTLSProtocol {
    public UrlHttpsProtocol() {
        this(null);
    }

    public UrlHttpsProtocol(Integer port) {
        super("HTTPS", "Hypertext Transfer Protocol Secure", UrlQueryState.OTHER, port);
    }

    public UrlHttpsProtocol(String name, String readableName, UrlQueryState state, Integer port) {
        super(name, readableName, state, port);
    }

    public UrlHttpsProtocol(String name, String readableName, UrlQueryState state) {
        this(name, readableName, state, null);
    }

    @Override
    public UrlProtocol clone() {
        return new UrlHttpsProtocol(name, readableName, state, port);
    }

    @Override
    public UrlProtocol clonePrivate() {
        return new UrlHttpsProtocol(name, readableName, UrlQueryState.PRIVATE, port);
    }

    @Override
    public UrlProtocol clonePublic() {
        return new UrlHttpsProtocol(name, readableName, UrlQueryState.PUBLIC, port);
    }
}
