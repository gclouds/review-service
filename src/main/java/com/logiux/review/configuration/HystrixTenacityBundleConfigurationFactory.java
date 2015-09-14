/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.configuration;

import com.google.common.collect.ImmutableMap;
import com.yammer.tenacity.core.bundle.BaseTenacityBundleConfigurationFactory;
import com.yammer.tenacity.core.config.BreakerboxConfiguration;
import com.yammer.tenacity.core.config.TenacityConfiguration;
import com.yammer.tenacity.core.properties.TenacityPropertyKey;
import com.yammer.tenacity.core.properties.TenacityPropertyKeyFactory;
import com.yammer.tenacity.core.properties.TenacityPropertyRegister;
import java.util.Map;

/**
 *
 * @author rvarghes
 */
public class HystrixTenacityBundleConfigurationFactory extends BaseTenacityBundleConfigurationFactory<ReviewServiceConfiguration> {
    @Override
    public Map<TenacityPropertyKey, TenacityConfiguration> getTenacityConfigurations(ReviewServiceConfiguration configuration) {
        final ImmutableMap.Builder<TenacityPropertyKey, TenacityConfiguration> builder = ImmutableMap.builder();
        builder.put(HystrixDashboardKey.TRIPADVISOR_REVIEW_API, configuration.getTripadvisorTenacityConfig());
        new TenacityPropertyRegister(builder.build(), configuration.getBreakerbox()).register();
        return builder.build();
    }   
    @Override
    public BreakerboxConfiguration getBreakerboxConfiguration(ReviewServiceConfiguration configuration) {
        return configuration.getBreakerbox();
    }

    @Override
    public TenacityPropertyKeyFactory getTenacityPropertyKeyFactory(ReviewServiceConfiguration t) {
      return new HystrixDashboardKeyFactory();
    }
}
