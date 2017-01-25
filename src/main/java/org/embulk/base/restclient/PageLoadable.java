package org.embulk.base.restclient;

import org.embulk.spi.PageBuilder;

import org.embulk.base.restclient.request.RetryHelper;
import org.embulk.base.restclient.writer.SchemaWriter;

public interface PageLoadable<T extends RestClientTaskBase>
{
    public void loadPage(T task, RetryHelper retryHelper, SchemaWriter schemaWriter, int taskCount, PageBuilder pageBuilderToLoad);
}
