package org.wx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wx.domain.Tbl;

/**
 *  Auto created by codeAppend plugin
 */
public interface TblService extends IService<Tbl> {

    Boolean order(Long userId, String sku, Integer count);
}