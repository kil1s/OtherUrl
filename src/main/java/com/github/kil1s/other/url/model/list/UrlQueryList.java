package com.github.kil1s.other.url.model.list;

import com.github.kil1s.other.url.model.UrlQuery;
import com.github.kil1s.other.url.model.list.domain.UrlDomainPrivate;
import com.github.kil1s.other.url.model.list.domain.UrlDomainPublic;
import com.github.kil1s.other.url.model.list.filepath.UrlFilepathPrivate;
import com.github.kil1s.other.url.model.list.filepath.UrlFilepathPublic;

import java.util.ArrayList;

public class UrlQueryList<T> extends ArrayList<T> implements UrlQuery {
    public UrlDomainPublic<T> toPublicDomain() {
        return new UrlDomainPublic<T>(this);
    }

    public UrlDomainPrivate<T> toPrivateDomain() {
        return new UrlDomainPrivate<T>(this);
    }

    public UrlFilepathPublic<T> toPublicFilepath() {
        return new UrlFilepathPublic<T>(this);
    }

    public UrlFilepathPrivate<T> toPrivateFilepath() {
        return new UrlFilepathPrivate<T>(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        boolean pseudo = o instanceof UrlPseudoQueryList;
        if (o == null || (getClass() != o.getClass() && (!(pseudo)))) {
            return false;
        }
        if (!super.equals(o)) return false;
        UrlQueryList<T> that = pseudo ? ((UrlPseudoQueryList<T>) o).queryList : (UrlQueryList) o;
        if (that.size() != super.size()) {
            return false;
        }

        for (int i = 0; i < super.size(); i++) {
            T part = super.get(i);
            T thatPart = that.get(i);
            if (!part.equals(thatPart)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder('[');
        for (T part:this) {
            str.append(part).append(", ");
        }
        str.append(']');
        return str.toString();
    }
}
