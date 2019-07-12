package com.github.zengfr.project.stepchain.test.processor;

import com.github.zengfr.project.stepchain.AbstractStepProcessor;
import com.github.zengfr.project.stepchain.test.SetProductRequest;
import com.github.zengfr.project.stepchain.test.SetProductResponse;
import com.github.zengfr.project.stepchain.test.context.SetProductContext;
import com.github.zengfr.project.stepchain.test.context.SetProductDataMiddle;

public class FeeProcessor extends AbstractStepProcessor<SetProductContext> {

	@Override
	protected Boolean execute(SetProductContext context) throws Exception {
		SetProductRequest req = context.left;
		SetProductResponse resp = context.right;
		SetProductDataMiddle middle = context.middle;
		middle.Price += 50;
		return true;
	}

}
