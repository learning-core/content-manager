package com.wolfleaning.contentmanager.domain.port;

import com.wolfleaning.contentmanager.domain.entity.ContentDomain;
import org.springframework.stereotype.Repository;

@Repository
public interface IContentManagerRepository {
    void save(ContentDomain domain);

}
