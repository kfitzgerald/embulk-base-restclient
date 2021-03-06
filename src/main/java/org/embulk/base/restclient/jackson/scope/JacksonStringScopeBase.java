package org.embulk.base.restclient.jackson.scope;

import com.fasterxml.jackson.databind.node.TextNode;

import org.embulk.base.restclient.jackson.JacksonServiceValue;
import org.embulk.base.restclient.record.EmbulkValueScope;
import org.embulk.base.restclient.record.SinglePageRecordReader;

public abstract class JacksonStringScopeBase
        extends EmbulkValueScope
{
    public abstract String scopeString(SinglePageRecordReader singlePageRecordReader);

    @Override
    public final JacksonServiceValue scopeEmbulkValues(SinglePageRecordReader singlePageRecordReader)
    {
        return new JacksonServiceValue(new TextNode(this.scopeString(singlePageRecordReader)));
    }
}
