package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeDocumentDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.EmployeeDocumentDetailsRepository;

@SuppressWarnings("unused")
@RestController
public class EmployeeDocumentDetailsController implements ServletContextAware {

	
	/*
	 * @RequestMapping("/") public String m1() {
	 * System.out.println("Called Index Page"); return "index"; }
	 * 
	 * public static String uploaded_Folder="D:\\Report\\";
	 * 
	 * @RequestMapping(value = "/upmulti",method = RequestMethod.POST) public String
	 * m3(@RequestParam("files") MultipartFile[] file) throws IOException {
	 * System.out.println("Id File : "+file); for(MultipartFile m:file) { byte[]
	 * b=m.getBytes(); Path path=Paths.get(uploaded_Folder+m.getOriginalFilename());
	 * Files.write(path, b); System.out.println("Uploaded Path : "+path); } return
	 * "success"; }
	 */
	
	
	
	  
	  private ServletContext servletContext;
	  @Autowired private EmployeeDocumentDetailsRepository eddr;
	  
	  @RequestMapping(value = "/upload",method = RequestMethod.POST) public
	  ResponseEntity<Void> upload(@RequestParam MultipartFile[] files){ try {
	  System.out.println("files List"); for(MultipartFile file:files) {
	  System.out.println("filename :"+file.getOriginalFilename());
	  System.out.println("file size :"+file.getSize());
	  System.out.println("file type :"+file.getContentType());
	  System.out.println("--------------------------------------------"); } return
	  new ResponseEntity<Void>(HttpStatus.OK); } catch(Exception e) { return new
	  ResponseEntity<Void>(HttpStatus.BAD_GATEWAY); } }
	  
	  
	  public String save(MultipartFile file) {
	  
	  try { SimpleDateFormat simpleDateFormat=new SimpleDateFormat(); String
	  newFilename=simpleDateFormat.format(new Date())+file.getOriginalFilename();
	  byte[] bytes=file.getBytes(); Path
	  path=Paths.get(this.servletContext.getRealPath("/uploads/files/"+newFilename)
	  ); Files.write(path,bytes); return newFilename; } catch (Exception e) {
	  return null; }
	  
	  }
	  
	  @Override public void setServletContext(ServletContext servletContext) {
	  this.servletContext=servletContext;
	  
	  }
	 

	/*
	 * public static String uploadDirectory = System.getProperty("user.dir");
	 * 
	 * @RequestMapping(value = "/saveEmployeeDocumentDetails", method =
	 * RequestMethod.POST) public String saveEmployeeDocumentDetails(@RequestParam
	 * MultipartFile[] files) throws IOException { StringBuilder filename = new
	 * StringBuilder();
	 * 
	 * final EmployeeDocumentDetails documentDetails = new
	 * EmployeeDocumentDetails(); for (int i1 = 0; i1 < files.length; i1++) {
	 * MultipartFile file = files[i1]; if (i1 == 0) {
	 * documentDetails.setEmployeeAdharcard(file.getBytes()); } if (i1 == 1) {
	 * documentDetails.setEmployeePanCard(file.getBytes()); } if (i1 == 2) {
	 * documentDetails.setEmployeePhoto(file.getBytes()); } }
	 * eddr.save(documentDetails); return "welcome to the Project"; }
	 */
}
