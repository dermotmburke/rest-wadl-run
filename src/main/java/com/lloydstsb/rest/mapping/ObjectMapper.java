package com.lloydstsb.rest.mapping;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public enum ObjectMapper {
	
    INSTANCE;
    
    private static DozerBeanMapper mapper = null;

    public static DozerBeanMapper getMapper() {
    	if(mapper  == null){
    		List myMappingFiles = new ArrayList();
    		myMappingFiles.add("dozer.xml");
    		DozerBeanMapper mapper = new DozerBeanMapper();
    		mapper.setMappingFiles(myMappingFiles);
    	}
        return INSTANCE.mapper;
    }


}
