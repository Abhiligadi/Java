class ProjectDTOUtil{

   public static void main (String a[])
   {
     ProjectDTO project = new ProjectDTO();
	  project.setProjectId(12L);
	  project.setProjectName("Multi row seeder");
	  project.setGuidName("M.D.Kommar");
	  project.setBasedOn("Agreecultur");
   System.out.println(project.getProjectId() + "\n" + project.getProjectName() + "\n" + project.getGuidName() + "\n" + project.getBasedOn());
   
   }


}