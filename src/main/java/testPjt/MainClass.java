package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
//프로젝트는 로컬에서 생성해서 import 해도 되고, 이클립스에서 maven 프로젝트를 만들어도 된다.
	public static void main(String[] args) {
		/*
		 * TransportationWalk transportationWalk = new TransportationWalk();
		 * transportationWalk.move();
		 */
		
		//컨테이너
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		ctx.close();
	}

}
