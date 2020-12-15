package com.github.neuralnetworks.calculation.operations.aparapi;


/**
 * Tanh activation function
 */
public class Tanh extends AparapiTensorFunction
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void run()
	{
		int id = getGlobalId() + startIndex;
		elements[id] = (2f / (1f + exp(-(2f*elements[id]))))-1f;
	}
}
