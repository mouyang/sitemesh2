package com.opensymphony.sitemesh;

import com.opensymphony.module.sitemesh.filter.BufferedContent;

import java.io.IOException;

/**
 * @author Joe Walnes
 * @since SiteMesh 3
 */
public interface ContentProcessor {

    boolean handles(SiteMeshContext context);
    boolean handles(String contentType);

    Content build(BufferedContent content, SiteMeshContext context) throws IOException;
}
