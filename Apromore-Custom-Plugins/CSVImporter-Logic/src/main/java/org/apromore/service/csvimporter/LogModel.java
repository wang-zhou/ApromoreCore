package org.apromore.service.csvimporter;

import java.util.List;

public class LogModel {

    private List<LogEventModel> rows;
    private long lineCount;
    private long errorCount;
    private List<String> invalidRows;
    private boolean errorCheck;

    public LogModel(List<LogEventModel> rows, long lineCount, long errorCount, List<String> invalidRows, boolean errorCheck) {
        this.rows        = rows;
        this.lineCount   = lineCount;
        this.errorCount  = errorCount;
        this.invalidRows = invalidRows;
        this.errorCheck  = errorCheck;
    }

    public List<LogEventModel> getRows() { return rows; }

    public long getLineCount() { return lineCount; }

    public long getErrorCount() { return errorCount; }

    public List<String> getInvalidRows() { return invalidRows; }

    public boolean getErrorCheck() { return errorCheck; }
}
