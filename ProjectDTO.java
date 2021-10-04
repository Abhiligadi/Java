public class ProjectDTO{
   public ProjectDTO(){
     System.out.println("ProjectDTO object is created");
   }
      private long projectId;
	  private String projectName;
      private String guidName;
      private String basedOn;	  

     public long getProjectId()
	 {
		return projectId;
	 }
      public void setProjectId(long projectId)
      {
		this.projectId=projectId;
	  }
      public String getProjectName()
	  {
		return projectName;  
	  }
      public void setProjectName(String projectName)
	  {
		this.projectName=projectName;
	  }
      public String getGuidName()
	  {
		 return guidName;
	  }
      public void setGuidName(String guidName)
	  {
		this.guidName=guidName;
	  }
      public String getBasedOn()
	  {
		return basedOn;
	  }
      public void  setBasedOn(String basedOn)
	  {
		this.basedOn=basedOn;
	  }
}