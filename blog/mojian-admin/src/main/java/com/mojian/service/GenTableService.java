package com.mojian.service;

import com.mojian.entity.GenTable;

import java.util.Map;

public interface GenTableService {

    Map<String, Object> selectGenTableList(GenTable genTable);
    
    Map<String, String> previewCode(Long tableId);
    
    int deleteGenTableByIds(Long[] tableIds);
    
    void generatorCode(String tables);
    
    String synchDb(String tableName);

    Map<String, Object> selectDbTableList(GenTable genTable);
    
    void importGenTable(String[] tableNames);

    /**
     * 下载代码
     * @param tableNames 表名数组
     * @return 生成的代码文件的字节数组
     */
    byte[] downloadCode(String[] tableNames);
} 