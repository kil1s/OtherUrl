package com.github.kil1s.other.url.model.protocol.wellknown.model;

import com.github.kil1s.other.url.model.UrlQueryState;
import com.github.kil1s.other.url.model.protocol.model.UrlProtocol;

public class UrlHttpProtocol extends UrlTCPProtocol {
    public UrlHttpProtocol() {
        this(null);
    }

    public UrlHttpProtocol(Integer port) {
        super("HTTP", "Hypertext Transfer Protocol", UrlQueryState.OTHER, port);
    }

    public UrlHttpProtocol(String name, String readableName, UrlQueryState state, Integer port) {
        super(name, readableName, state, port);
    }

    public UrlHttpProtocol(String name, String readableName, UrlQueryState state) {
        this(name, readableName, state, null);
    }

    @Override
    public UrlProtocol clone() {
        return new UrlHttpProtocol(name, readableName, state, port);
    }

    @Override
    public UrlProtocol clonePrivate() {
        return new UrlHttpProtocol(name, readableName, UrlQueryState.PRIVATE, port);
    }

    @Override
    public UrlProtocol clonePublic() {
        return new UrlHttpProtocol(name, readableName, UrlQueryState.PUBLIC, port);
    }
}
