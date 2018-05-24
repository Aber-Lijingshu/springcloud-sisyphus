package com.prometheus.sisyphus.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wujun on 2017/02/17.
 */
public abstract class LoggerService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
}
