package com.zking.ssm.service;

import com.zking.ssm.model.File;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFileService {

    void add(com.zking.ssm.model.File file);

    com.zking.ssm.model.File load(com.zking.ssm.model.File file);
}
