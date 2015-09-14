/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logiux.review.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author rvarghes
 */
public class ReviewServices {
    //Prevents instantiation
    private ReviewServices(){}
    
    private static final Map<String, IReviewServiceProvider> providers = new ConcurrentHashMap<String, IReviewServiceProvider>();
    public static final String DEFAULT_PROVIDER_NAME = "tripadvisor";
    
    public static void registerDefaultProvider(IReviewServiceProvider p){
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    
    public static void registerProvider(String name, IReviewServiceProvider p){
        providers.put(name, p);
    }
    
    public static IReviewService newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    
    public static IReviewService newInstance(String name){
        IReviewServiceProvider p = providers.get(name);
        if (p==null)
            throw new IllegalArgumentException("No provider registered with name: "+name);
        return p.ReviewService();
    }
}
