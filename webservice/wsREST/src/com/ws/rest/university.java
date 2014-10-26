package com.ws.rest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.core.header.FormDataContentDisposition;
@Path("/university")
public class university {
	/*@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo(){
		
		return "<html>"+"<title>"+"unversity information"+"</title>"+"<body>"+
		"<h1>"+"Name-SL Universities"+"</h1>"+"</body>"+"</html>";	
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo(){
		
		return 	"Name-SL Universities";
		
	}
	
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRollNo")String studentRollNo){
		return "Done Successfull";
	}
	*/
	/* using path parameters
	@GET
	@Path("{studentRollNo1}/{studentRollNo2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String setStudentInfo(
			@PathParam("studentRollNo1")String studentRollNo1,
			@PathParam("studentRollNo2")String studentRollNo2){
		
		return "you sent two parameters"+ studentRollNo1+ "and"+ studentRollNo2;
	}
	*/
	/*using query parameter
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String setStudentInfo(
			@QueryParam("studentRollNo1")String studentRollNo1,
			@QueryParam("studentRollNo2")String studentRollNo2){
		
		return "you sent two parameters"+ studentRollNo1+ "and"+ studentRollNo2;
	}
	*/
	/* using matrix parameter
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String setStudentInfo(
			@MatrixParam("studentRollNo1")String studentRollNo1,
			@MatrixParam("studentRollNo2")String studentRollNo2){
		
		return "you sent two parameters"+ studentRollNo1+ "and"+ studentRollNo2;
	}
	*/
	/*@POST
	@Path("/add")
	public String addStudentInfo(
			@FormParam("name")String name,
			@FormParam("age")int age){
		
		return "you sent two parameter" + name+ " and "+age;
	}
	*/
	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public String uploadFile(
			@FormParam("file") InputStream uploadeInputStream,
			@FormParam("file") FormDataContentDisposition fileDetail){
		
		saveToDisk(uploadeInputStream, fileDetail);
		return "file uploaded successfully";
		
		
	}

	private void saveToDisk(InputStream uploadeInputStream,
			FormDataContentDisposition fileDetail) {
		// TODO Auto-generated method stub
		String uploadedFileLocation="/home"+fileDetail.getFileName();
		try{
			OutputStream out = new FileOutputStream(new File(uploadedFileLocation));
			int read=0;
			byte [] bytes=new byte[1024];
			out= new FileOutputStream(new File(uploadedFileLocation));
			while((read=uploadeInputStream.read(bytes))!=-1){
				out.write(bytes,0,read);
			}
			out.flush();
			out.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
	}
}
