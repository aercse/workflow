package org.neuro4j.workflow.core;


import org.neuro4j.workflow.FlowContext;
import org.neuro4j.workflow.common.FlowExecutionException;
import org.neuro4j.workflow.common.ParameterDefinition;
import org.neuro4j.workflow.common.ParameterDefinitionList;

import org.neuro4j.workflow.enums.CachedNode;
import static org.neuro4j.workflow.core.CustomBlockNodeCached.*;
import static org.neuro4j.workflow.enums.ActionBlockCache.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.neuro4j.workflow.ActionBlock;


@ParameterDefinitionList(input={
                                	@ParameterDefinition(name=IN_PARAM, isOptional=true, type= "java.lang.String")},
                         output={
                         	        })
@CachedNode(type=NODE)
public class CustomBlockNodeCached implements ActionBlock {
    
    static final String IN_PARAM = "param";
      
    private final AtomicInteger executeCounter = new AtomicInteger(0);
    private final AtomicInteger initCounter = new AtomicInteger(0);
    
    public int execute(FlowContext ctx) throws FlowExecutionException {
		
		Object param = ctx.get(IN_PARAM);
        
		
		//TODO: put your code here
		
        if (/*error != */false)
        {
        	return ERROR;
        }
		
		
		
		return NEXT;
	}
	
    @Override
    public void init() throws FlowExecutionException {
    	initCounter.getAndIncrement();
    }

	public AtomicInteger getExecuteCounter() {
		return executeCounter;
	}

	public AtomicInteger getInitCounter() {
		return initCounter;
	}
	

}
