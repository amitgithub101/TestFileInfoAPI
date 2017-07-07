package com.TestFileInfoAPI;

import java.util.List;

/**
 * Created by amittawde on 07/07/2017.
 * Interface for listing the files in a directory and find unsupported files
 */

public interface IListFiles {

    List<FileInfo> listFiles(String directoryName);
    List<FileInfo> listUnsupportedFileTypes(String directoryName, String unsupportedFileType);

}

