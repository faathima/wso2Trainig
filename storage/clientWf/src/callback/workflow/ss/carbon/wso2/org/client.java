package callback.workflow.ss.carbon.wso2.org;

public class client {
	public static void main (String [] args) throws Exception{
		String approve="a";
		String wf="xfcs";
		String sts="xcz";
	WorkflowCallbackServiceStub stub = new WorkflowCallbackServiceStub();
	WorkflowCallbackServiceStub.ResumeEvent re= new WorkflowCallbackServiceStub.ResumeEvent();
	re.setDescription(sts);
	re.setStatus(approve);
	re.setWorkflowReference(wf);
	stub.resumeEvent(re);
	System.out.print(re);
}

}
