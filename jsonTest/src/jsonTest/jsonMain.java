package jsonTest;

public class jsonMain {

	public static void main(String[] args) {

		String arg = args[0];
		
		if(arg.equals("jsonNet")) {
			jsonNet.jsonNet();
		}else if(arg.equals("jsonNet2")) {
			jsonNet2.jsonNet2();
		}else if(arg.equals("jsonNetArray")) {
			jsonNetArray.jsonNetArray();
		}else if(arg.equals("jsonElastic")) {
			jsonElastic.jsonElastic();
		}else if(arg.equals("jsonElasticArray")) {
			jsonElasticArray.jsonElasticArray();
		}else if(arg.equals("jsonTest")) {
			jsonTest.jsonTest();
		}else if(arg.equals("jsonTest2")) {
			jsonTest2.jsonTest2();
		}else if(arg.equals("jsonTestArray")) {
			jsonTestArray.jsonTestArray();
		}else if(arg.equals("jsonTest3")) {
			jsonTest3.jsonTest3();
		}else if(arg.equals("Test")) {
			Test.Test();
		}else if(arg.equals("Test2")) {
			Test2.Test2();
		}else if(arg.equals("Test3")) {
			Test3.Test3();
		}else if(arg.equals("TestArray")) {
			TestArray.TestArray();
		}else if(arg.equals("TestElastic")) {
			TestElastic.TestElastic();
		}else if(arg.equals("TestElasticArray")) {
			TestElasticArray.TestElasticArray();
		}
	}

}
