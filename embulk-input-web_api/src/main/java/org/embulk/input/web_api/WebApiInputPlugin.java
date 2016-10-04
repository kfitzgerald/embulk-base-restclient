package org.embulk.input.web_api;

import org.embulk.config.ConfigDiff;
import org.embulk.input.web_api.schema.SchemaWrapper;
import org.embulk.input.web_api.writer.SchemaWriter;
import org.embulk.spi.PageBuilder;
import org.embulk.spi.Schema;

import static org.embulk.spi.Exec.newConfigDiff;

public class WebApiInputPlugin
        extends AbstractWebApiInputPlugin<WebApiInputPlugin.PluginTask>
{
    public interface PluginTask
            extends WebApiPluginTask
    {
        // TODO
    }

    @Override
    protected PluginTask validatePluginTask(PluginTask task)
    {
        return task;
    }

    @Override
    protected Class<PluginTask> getInputTaskClass()
    {
        return PluginTask.class;
    }

    @Override
    protected SchemaWrapper buildSchemaWrapper(PluginTask task)
    {
        throw new UnsupportedOperationException("should implement");
    }

    @Override
    protected ConfigDiff buildConfigDiff(PluginTask task)
    {
        // do nothing
        return newConfigDiff();
    }

    @Override
    protected void loadFromWebApi(PluginTask task, Schema schema, SchemaWriter schemaWriter, int taskCount, PageBuilder to)
    {
        throw new UnsupportedOperationException("should implement");
    }
}
