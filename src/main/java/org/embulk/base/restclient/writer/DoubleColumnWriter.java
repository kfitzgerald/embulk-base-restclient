package org.embulk.base.restclient.writer;

import org.embulk.spi.Column;
import org.embulk.spi.PageBuilder;

import org.embulk.base.restclient.record.ServiceRecord;
import org.embulk.base.restclient.record.ServiceValue;
import org.embulk.base.restclient.record.ValueLocator;

public class DoubleColumnWriter
        extends ColumnWriter
{
    public DoubleColumnWriter(Column column, ValueLocator valueLocator)
    {
        super(column, valueLocator);
    }

    @Override
    public void writeColumn(ServiceRecord record, PageBuilder pageBuilder)
    {
        ServiceValue value = pickupValue(record);
        if (value == null || value.isNull()) {
            pageBuilder.setNull(getColumn());
        }
        else {
            pageBuilder.setDouble(getColumn(), value.doubleValue());
        }
    }
}
