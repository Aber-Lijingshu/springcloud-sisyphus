package com.prometheus.sisyphus.common.service;


import com.prometheus.sisyphus.common.model.PageInfo;

/**
 * Created by wujun on 2017/02/25.
 *
 * @author wujun
 * @since 2017/02/25
 */
public interface BasePageService<T> extends BaseService<T> {

    PageInfo<T> listPage(PageInfo<T> pageInfo, T entity);
}
