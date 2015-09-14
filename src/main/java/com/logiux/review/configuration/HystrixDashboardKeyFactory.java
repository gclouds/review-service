/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.configuration;

import com.yammer.tenacity.core.properties.TenacityPropertyKey;
import com.yammer.tenacity.core.properties.TenacityPropertyKeyFactory;

/**
 *
 * @author rvarghes
 */
public class HystrixDashboardKeyFactory implements TenacityPropertyKeyFactory {
    @Override
    public TenacityPropertyKey from(String value) {
        return HystrixDashboardKey.valueOf(value.toUpperCase());
    }
}
