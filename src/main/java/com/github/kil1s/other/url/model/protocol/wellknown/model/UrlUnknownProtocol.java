package com.github.kil1s.other.url.model.protocol.wellknown.model;

import com.github.kil1s.other.url.model.UrlQueryState;
import com.github.kil1s.other.url.model.protocol.model.UrlProtocol;
import com.github.kil1s.other.url.model.protocol.model.UrlProtocolAbstract;

public class UrlUnknownProtocol extends UrlProtocolAbstract {
    public UrlUnknownProtocol(String name, String readableName, UrlQueryState state, Integer port) {
        super(name, readableName, state, port);
    }

    public UrlUnknownProtocol(String name, String readableName, UrlQueryState state) {
        this(name, readableName, state, null);
    }

    @Override
    public UrlProtocol clone() {
        return new UrlUnknownProtocol(name, readableName, state, port);
    }

    @Override
    public UrlProtocol clonePrivate() {
        return new UrlUnknownProtocol(name, readableName, UrlQueryState.PRIVATE, port);
    }

    @Override
    public UrlProtocol clonePublic() {
        return new UrlUnknownProtocol(name, readableName, UrlQueryState.PUBLIC, port);
    }
}
