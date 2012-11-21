package org.amm.springremote.client;

import org.amm.springremote.service.StateCapitalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class demonstrates a client of a Spring HTTP-exposed service and shows
 * how the client interacts with the server as if using normal Java objects
 * rather than using anything HTTP specific.
 */
public class HttpClient
{
   public static void printStateInfo(
      final StateCapitalService stateCapitalMapper,
      final String state)
   {
      System.out.println(
           "The capital of " + state + " is "
         + stateCapitalMapper.getCapital(state));
   }

   public static void main(final String[] arguments)
   {
      final ApplicationContext context =
         new ClassPathXmlApplicationContext(
            "org/amm/springremote/client/spring-http-client-config.xml");
      final StateCapitalService stateCapitalService =
         (StateCapitalService) context.getBean("stateCapitalProxyService");
      printStateInfo(stateCapitalService, "Colorado");
      printStateInfo(stateCapitalService, "Alabama");
   }
}
