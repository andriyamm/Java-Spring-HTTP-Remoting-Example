package org.amm.springremote;

import org.amm.springremote.service.StateCapitalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrates how Spring bean can be used without any HTTP involvement.
 */
public class MainServiceAppContext {
	
	public static void printStateInfo(
			final StateCapitalService stateCapitalMapper, final String state) {
		System.out.println("The capital of " + state + " is "
				+ stateCapitalMapper.getCapital(state));
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/amm/springremote/spring-http-config.xml");
		StateCapitalService stateCapitalMapper = (StateCapitalService) context
				.getBean("stateCapitalService");
		printStateInfo(stateCapitalMapper, "Alabama");
		printStateInfo(stateCapitalMapper, "Colorado");
	}
}
